package eu.kenway.passingdatabetweenactivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class SecondActivity : AppCompatActivity() {
    lateinit var personabout:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        personabout=findViewById(R.id.tvPersonn)
        val peron=intent.getSerializableExtra("EXTRA_PERSON") as Person


        personabout.text=peron.toString()



    }
}