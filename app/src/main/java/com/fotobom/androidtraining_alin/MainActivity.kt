package com.fotobom.androidtraining_alin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.cilckhereButton).setOnClickListener{
            val intent = Intent(this@MainActivity, SubActivity::class.java)
            startActivity(intent)
        }
    }

}
