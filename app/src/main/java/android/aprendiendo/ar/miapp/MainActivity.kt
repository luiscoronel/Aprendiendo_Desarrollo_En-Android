package android.aprendiendo.ar.miapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    //Declare var btEnviar
    var btEnviar: Button? = null
    var etIngresar:EditText? = null
    var tvMostrar:TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btIr:Button = findViewById(R.id.btIr)

        btEnviar = findViewById(R.id.btEnviar)
        etIngresar = findViewById(R.id.etIngresar)
        tvMostrar = findViewById(R.id.tvMostrar)



        btEnviar?.setOnClickListener{

            val texto = etIngresar?.text

            //Show text for screen
            tvMostrar?.setText(texto)

            //Test with Toast
            //Toast.makeText(this, "Se acciono el boton enviar", Toast.LENGTH_SHORT).show()
        }

        btIr?.setOnClickListener {
            val i = Intent(this, Main2Activity::class.java)
            startActivity(i)
        }


    }
}
