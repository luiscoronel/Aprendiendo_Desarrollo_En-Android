package android.aprendiendo.ar.miapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var btEnviar: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btEnviar = findViewById(R.id.btEnviar)

        btEnviar?.setOnClickListener{
            Toast.makeText(this, "Se acciono el boton enviar", Toast.LENGTH_SHORT).show()
        }


    }
}
