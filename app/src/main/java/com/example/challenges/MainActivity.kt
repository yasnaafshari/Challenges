package com.example.countdown

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.challenges.R
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView = findViewById<TextView>(R.id.textView)
        val numberEditText = findViewById<TextInputEditText>(R.id.numberEditText)

        val startButton = findViewById<MaterialButton>(R.id.start)
        startButton.setOnClickListener {
            val intent = Intent(this, CountdownActivity::class.java)
            var number = numberEditText.text.toString().toIntOrNull()
            intent.putExtra("COUNT_DOWN_NUMBER",number)
            startActivity(intent)

        }
    }
}



