package com.fotobom.androidtraining_alin

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.android.material.floatingactionbutton.FloatingActionButton

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        /** View next activity on button click */
        val nextButton = findViewById<Button>(R.id.nextButton)
        nextButton.setOnClickListener{
            val intent = Intent(this@SubActivity, OrientationActivity::class.java)
            startActivity(intent)
        }

        /** Shows input test as toast message on button click */
        val toastBtn = findViewById<FloatingActionButton>(R.id.toastButton)
        toastBtn.setOnClickListener{
            showToast()
        }
    }

    /** Function to show toast message after button click */
    fun showToast(){
        val inputId = findViewById<EditText>(R.id.toastInput)
        val toastMsg = inputId.text.toString()
        val toast = Toast.makeText(applicationContext, toastMsg, Toast.LENGTH_SHORT)
        toast.show()
    }
}