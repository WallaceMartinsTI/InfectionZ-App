package com.wcsm.infectionzapp.navigation.helpwiki.utils

import android.graphics.Canvas
import android.graphics.Paint
import androidx.recyclerview.widget.RecyclerView

class CustomDividerItemDecoration(
    private val dividerHeight: Int,
    private val dividerColor: Int,
    private val dividerWidth: Int
) : RecyclerView.ItemDecoration() {

    private val paint = Paint().apply {
        color = dividerColor
    }

    override fun onDraw(canvas: Canvas, parent: RecyclerView, state: RecyclerView.State) {
        val childCount = parent.childCount
        for (i in 0 until childCount) {
            val child = parent.getChildAt(i)
            val params = child.layoutParams as RecyclerView.LayoutParams

            val top = child.bottom + params.bottomMargin
            val bottom = top + dividerHeight

            val left = (child.left + (child.width / 2) - (dividerWidth / 2)).toFloat()
            val right = left + dividerWidth

            canvas.drawRect(left, top.toFloat(), right, bottom.toFloat(), paint)
        }
    }
}
