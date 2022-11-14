package com.example.conversaodemoedas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.isEmpty

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnCalcular = findViewById<Button>(R.id.btn_Calcular)


        btnCalcular.setOnClickListener {
            Converter()
        }

    }
   private fun Converter(){
       val valor = findViewById<EditText>(R.id.edit_Valor)
       val tvResultado = findViewById<TextView>(R.id.tv_Resultado)
       val Seletor = findViewById<RadioGroup>(R.id.radioGroup)

       //Variavel responsavel por pegar o valor da variavel em si
        val value = valor.text.toString()

       //varial responsavel por armazenar o id do botao que está selecionado
       val checagem = Seletor.checkedRadioButtonId

//checagem para pegar qual radium esta selecionado e atribuir na variavel currency
       val currency = when(checagem){
           R.id.btn_usd -> "USD"
           R.id.btn_eur -> "EUR"
           else         ->"CLP"

       }
       //se o valor for vazio o app nao manda resultado nenhum
        if (value.isEmpty())
            return
   }
}