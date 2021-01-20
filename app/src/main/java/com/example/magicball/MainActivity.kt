package com.example.magicball

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.*

//import com.example.magicball.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private val answers = listOf("Definitely", "Maybe", "Ak My Mum","Perhaps","Ask Again!","Plausible","Hazy","Most Probably","Almost Certainly")



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textAnswer:TextView = findViewById(R.id.tvAnswer)
        val editText : EditText = findViewById(R.id.editText)
        val magicBall:ImageButton = findViewById(R.id.btnAnswer)
        magicBall.setOnClickListener{

            textAnswer.setText(selectRandomAnswer())
            editText.setText("")
//            Toast.makeText(this,"Magic Ball Clicked",Toast.LENGTH_SHORT).show()
        }

    }
    fun selectRandomAnswer(): String {
        return answers.random()
    }

}