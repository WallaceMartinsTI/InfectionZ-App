package com.wcsm.infectionzapp.navigation.quests

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.wcsm.infectionzapp.R
import com.wcsm.infectionzapp.databinding.ActivityQuestsBinding
import com.wcsm.infectionzapp.navigation.quests.adapter.QuestsAdapter
import com.wcsm.infectionzapp.navigation.quests.data.questsItemsList
import com.wcsm.infectionzapp.navigation.quests.model.QuestItem

class QuestsActivity : AppCompatActivity() {

    private val binding by lazy { ActivityQuestsBinding.inflate(layoutInflater) }

    private val sharedPreferences: SharedPreferences by lazy {
        getSharedPreferences("InfectionZ App", Context.MODE_PRIVATE)
    }

    private val gson = Gson()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        formatQuestsTitle()

        val questsList = questsItemsList

        binding.rvQuests.adapter = QuestsAdapter(
            questsList = questsList,
            getQuestsStatusMap = { getQuestsStatusMap() }
        ) { questItem, isChecked ->
            saveOrUpdateQuestStatus(questItem, isChecked)
        }
        binding.rvQuests.layoutManager = LinearLayoutManager(this)
    }

    private fun formatQuestsTitle() {
        val fullText = "INFECTION Z\nMISSÕES"
        val spannable = SpannableString(fullText)
        val redColor =  resources.getColor(R.color.primaryRed)

        spannable.setSpan(
            ForegroundColorSpan(redColor),
            fullText.indexOf("Z"),
            fullText.indexOf("Z") + "Z".length,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )

        spannable.setSpan(
            ForegroundColorSpan(redColor),
            fullText.indexOf("MISSÕES"),
            fullText.indexOf("MISSÕES") + "MISSÕES".length,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )

        binding.textQuestsTitle.text = spannable
    }

    private fun saveOrUpdateQuestStatus(questItem: QuestItem, isChecked: Boolean) {
        val questsStatusMap = getQuestsStatusMap().toMutableMap()
        questsStatusMap[questItem.title] = isChecked

        val json = gson.toJson(questsStatusMap)
        val editor = sharedPreferences.edit()
        editor.putString("quests_status_map", json)
        editor.apply()
    }

    private fun getQuestsStatusMap(): Map<String, Boolean> {
        val jsonQuestsStatus = sharedPreferences.getString("quests_status_map", null)
        return if (jsonQuestsStatus != null) {
            val type = object : TypeToken<Map<String, Boolean>>() {}.type
            gson.fromJson(jsonQuestsStatus, type)
        } else {
            emptyMap()
        }
    }
}