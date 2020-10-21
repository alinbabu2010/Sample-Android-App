package com.fotobom.androidtraining_alin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.floatingactionbutton.FloatingActionButton

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        findViewById<FloatingActionButton>(R.id.toast_button).setOnClickListener{

            val inputId = findViewById<EditText>(R.id.toast_input)
            val toastMsg = inputId.text.toString()
            val toast = Toast.makeText(applicationContext, toastMsg, Toast.LENGTH_SHORT)
            toast.show()
        }
    }
}