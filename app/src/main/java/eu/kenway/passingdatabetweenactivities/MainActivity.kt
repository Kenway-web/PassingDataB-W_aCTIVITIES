package eu.kenway.passingdatabetweenactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var btn:Button
    lateinit var name:EditText
    lateinit var cntr:EditText
    lateinit var age:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn=findViewById(R.id.etButtonApply)
        name=findViewById(R.id.etName)
        cntr=findViewById(R.id.etCountry)
        age=findViewById(R.id.etAge)

        btn.setOnClickListener{

             val person=Person(name.text.toString(),age.text.toString().toInt(),cntr.text.toString())
            Intent(this,SecondActivity::class.java).also {
                it.putExtra("EXTRA_PERSON",person)
                startActivity(it)
            }

        }

    }
}