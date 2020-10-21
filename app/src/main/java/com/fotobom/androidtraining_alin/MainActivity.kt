package com.fotobom.androidtraining_alin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /** View next activity on button click */
        findViewById<Button>(R.id.cilckButton).setOnClickListener{
            val intent = Intent(this@MainActivity, SubActivity::class.java)
            startActivity(intent)
        }
    }

}
