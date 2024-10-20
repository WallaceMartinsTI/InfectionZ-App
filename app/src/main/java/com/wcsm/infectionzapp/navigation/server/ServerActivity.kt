package com.wcsm.infectionzapp.navigation.server

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.wcsm.infectionzapp.R
import com.wcsm.infectionzapp.databinding.ActivityServerBinding

class ServerActivity : AppCompatActivity() {

    private val binding by lazy { ActivityServerBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        formatServerTitle()
        fillServerDescription()
        fillServerRules()
        initButtons()
    }

    private fun initButtons() {
        initOpenDiscordButton()
        initOpenYoutubeButton()
        initOpenInstagramButton()
    }

    private fun initOpenDiscordButton() {
        binding.btnServerOpenDiscord.setOnClickListener {
            val discordLink = "https://discord.gg/MGpuGQbQ"
            val intent = Intent(Intent.ACTION_VIEW).apply {
                data = Uri.parse(discordLink)
                setPackage("com.discord")
            }

            try {
                startActivity(intent)
            } catch (e: ActivityNotFoundException) {
                val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(discordLink))
                startActivity(browserIntent)
            }
        }
    }

    private fun initOpenYoutubeButton() {
        binding.btnServerOpenYoutube.setOnClickListener {
            val youtubeLink = "https://www.youtube.com/@INFECTIONZOFICIAL"
            val intent = Intent(Intent.ACTION_VIEW).apply {
                data = Uri.parse(youtubeLink)
                setPackage("com.google.android.youtube")
            }

            try {
                startActivity(intent)
            } catch (e: ActivityNotFoundException) {
                val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(youtubeLink))
                startActivity(browserIntent)
            }
        }
    }

    private fun initOpenInstagramButton() {
        binding.btnServerOpenInstagram.setOnClickListener {
            val youtubeLink = "https://www.instagram.com/infectionz.mtadayz/"
            val intent = Intent(Intent.ACTION_VIEW).apply {
                data = Uri.parse(youtubeLink)
                setPackage("com.instagram.android")
            }

            try {
                startActivity(intent)
            } catch (e: ActivityNotFoundException) {
                val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(youtubeLink))
                startActivity(browserIntent)
            }
        }
    }

    private fun formatServerTitle() {
        val fullText = "INFECTION Z\nSERVER"
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
            fullText.indexOf("SERVER"),
            fullText.indexOf("SERVER") + "SERVER".length,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )

        binding.textServerTitle.text = spannable
    }

    private fun fillServerDescription() {
        val description = """
            ╔═══════════════════════════ 
            ║    INFECTIONZ DAYZ BR OFICIAL 
            ║ 
            ║➥ A maior comunidade de MTA DayZ!  
            ║➥ Mais de 12.000 membros no Discord!  
            ║➥ Eventos diariamente!  
            ║➥ Atualizações frequentes!  
            ║➥ Muito PVP pelo mapa!  
            ║➥ Sobrevivência!  
            ║➥ Ping Baixo!  
            ║➥ Sistema de Bases Privadas!  
            ║➥ Sistema de Armas Raras e Skins!  
            ║➥ A maior variedade de armas do MTA!  
            ║➥ A maior variedade de veículos do MTA!  
            ║➥ Sistema de Carros Raros!  
            ║➥ PVP de carro!  
            ║➥ +FPS Boost!  
            ║➥ Mapa totalmente modificado!  
            ║➥ Sistema de zumbis e boss!  
            ╠═══════════════════════════ 
            ║➥ https://discord.gg/infectionz 
            ╠═══════════════════════════ 
            ║➥ IFZ #1 IP: mtasa://158.69.22.166:22003  
            ║➥ IFZ #2 IP: mtasa://158.69.22.166:22006  
            ║➥ IFZ #3 IP: mtasa://158.69.22.166:22011  
            ║➥ IFZ Arena IP: mtasa://158.69.22.166:22009  
            ╚═══════════════════════════
        """.trimIndent()

        binding.textServerDescription.text = description
    }

    private fun fillServerRules() {
        val rules = """
            REGRAS: INFECTIONZ MTA DAYZ 

            N° 1 - Proibido racismo/preconceitos em nosso Servidor
                      1.1    - Fica proibido qualquer tipo de preconceito racial

            N° 2 - Proibido o uso de alguns macros em nosso Servidor
                      2.1    - Macro que altere a velocidade do seu personagem ou faça o mesmo teleportar

            N° 3 - Proibido o uso de hacks em nosso Servidor
                      3.1    - Jogadores que usarem qualquer tipo de injetores, hacks ou scripts de ajuda externa, serão permanentemente banidos

            N° 4 - Fica proibida a venda ou negociação de itens ou veículos, por dinheiro real, que não seja direcionado à investimentos no Servidor
                      4.1    - Vendas só são permitidas no PIX do servidor ou Saldo
                      4.2    - Jogadores que tentarem fazer comércio em "PIX próprio", serão permanentemente banidos por tentativa de golpe ao Servidor

            N° 5 - Proibido divulgações de outro servidor em nossos chats

            N° 6 - Evite o flood no chat (spam)

            N° 7 - Camperar bases utilizando tendas/veículos
                      7.1    - Proibido o uso de Tendas para cover do lado de fora
                      7.2    - Proibido o uso de Tendas para camperar em cima da base
                      7.3    - Proibido o uso de Tendas ou veículos para bloquear a passagem da base
                      7.4    - Proibido jogar veículos em ACLs alheias para bloquear a entrada de outros carros

            N° 8 - NÃO utilize tendas para 'grifar' o mapa
                      8.1    - Proibido utilizar tendas para fechar ruas, bases ou bloquear passagens
                      8.2    - Proibido uso de tendas para qualquer fim que não seja guardar itens

            N° 9 - Proibido o uso de qualquer tipo de BUG em nosso Servidor
                      9.1    - Jogadores que forem pegos utilizando de BUGs do jogo, para se beneficiar, serão permanentemente banidos
                      9.2    - A regra é bem clara, qualquer tipo de BUG que te dê vantagem perante aos outros jogadores ou que ainda afete a jogabilidade dos mesmos, será motivo de banimento

            N° 10 - Não tente se passar por membros da STAFF

            N° 11 - Proibido o ROUBO em trocas/negociações dentro do servidor
                      11.1    - Fica proibido o roubo entre jogadores, nos casos em que a negociação envolva transferência de PIX ou Saldo
                      11.2    - Em caso de roubos em negociações de veículos, IFZ Money, bases ou itens que não envolvam PIX ou Saldo, será necessário clip/prints para comprovar a denúncia

            N° 12 - Proibido desrespeitar/ofender os membros da STAFF ou o Servidor


            Atenciosamente, equipe InfectionZ.
        """.trimIndent()

        binding.textServerRules.text = rules
    }
}