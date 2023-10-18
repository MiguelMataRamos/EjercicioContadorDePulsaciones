package com.example.ejerciciocontadordepulsaciones

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton = findViewById<Button>(R.id.boton)
        val contador = findViewById<TextView>(R.id.contador)
        var cont = 0
        val frase = findViewById<TextView>(R.id.frase)
        val pantalla = findViewById<View>(R.id.pantalla)
        val imagen = findViewById<ImageView>(R.id.imageView)


        boton.setOnClickListener{
            cont++
            contador.text = cont.toString()
            when(cont){
                1 -> frase.text = "Has pulsado una vez"
                2 -> frase.text = "Has pulsado dos veces"
                3 -> frase.text = "Novea que makina"
                4 -> frase.text = "Se te va a cansar el deo"
                5 -> frase.text = "Yasta no?"
                6 -> frase.text = "Todavia sigues?"
                7 -> frase.text = "Llevas 7 ya"
                8 -> frase.text = "Yo que tu paraba"
                9 -> frase.text = "Pues yasta lo que tu veas"
                10 -> frase.text = "Yo me cansao ya"
                11 -> frase.text = "Zzzzzz"
            }

            if(cont%2!=0){
                boton.setBackgroundColor(getColor(R.color.black))
                contador.setTextColor(getColor(R.color.white))
                pantalla.setBackgroundColor(getColor(R.color.blue))
            }else{
                boton.setBackgroundColor(getColor(R.color.white))
                contador.setTextColor(getColor(R.color.black))
                pantalla.setBackgroundColor(getColor(R.color.red))
            }

            if (cont>24){
                imagen.visibility = ImageView.VISIBLE
            }

        }

    }
}