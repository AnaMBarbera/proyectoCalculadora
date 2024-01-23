package es.anabarbera.sumadosnumeros

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val datonum1:EditText = findViewById(R.id.datoNum1)
        val datonum2:EditText = findViewById(R.id.datoNum2)
        val botonsuma:Button = findViewById(R.id.Suma)
        val botonresta:Button = findViewById(R.id.Resta)
        val resultado:TextView = findViewById(R.id.resultado)

        //le damos instrucciones al botón
        botonsuma.setOnClickListener {
            val num1 = datonum1.text.toString().toInt()
            val num2 = datonum2.text.toString().toInt()
            val suma = num1 + num2
            resultado.text = "Resultado = ${suma.toString()}"
        }
        botonresta.setOnClickListener {
            val num1 = datonum1.text.toString().toInt()
            val num2 = datonum2.text.toString().toInt()
            val suma = num1 - num2
            resultado.text = "Resultado = ${suma.toString()}"
        }
    }
}