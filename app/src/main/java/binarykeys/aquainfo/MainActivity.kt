package binarykeys.aquainfo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.password_fragment.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.password_fragment)

        floatingActionButton2.setOnClickListener{

            Toast.makeText(this@MainActivity,"Kotlin!",Toast.LENGTH_LONG).show()
       }

    }
}
