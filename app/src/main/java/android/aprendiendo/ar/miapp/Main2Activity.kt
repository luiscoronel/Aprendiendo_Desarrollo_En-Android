package android.aprendiendo.ar.miapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val mensaje = intent.getStringExtra("CODIGO")
        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show()
    }
}
