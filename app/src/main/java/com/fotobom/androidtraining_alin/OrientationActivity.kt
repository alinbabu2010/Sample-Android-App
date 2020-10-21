package com.fotobom.androidtraining_alin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class OrientationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_orientation)

        /** Show dialog box on button click */
        val button = findViewById<Button>(R.id.buttonClickme)
        button.setOnClickListener {
            showAlert()
        }

    }

    /** Function to show alert dialog box after button click.  */
    fun showAlert(){
        val inputId = findViewById<EditText>(R.id.textInputSample)
        val toastMsg = inputId.text.toString()
        val builder = AlertDialog.Builder(this)
        builder.setTitle(R.string.dialogTitle)
        builder.setMessage(R.string.dialogMessage)
        builder.setIcon(android.R.drawable.ic_dialog_alert)
        builder.setPositiveButton("Yes"){dialogInterface, which ->
            Toast.makeText(applicationContext,toastMsg, Toast.LENGTH_LONG).show()
        }
        builder.setNeutralButton("Cancel"){dialogInterface , which ->
            Toast.makeText(applicationContext,"Clicked cancel\n Operation cancelled.", Toast.LENGTH_LONG).show()
        }
        builder.setNegativeButton("No"){dialogInterface, which ->
            Toast.makeText(applicationContext,"Clicked No", Toast.LENGTH_LONG).show()
        }
        val alertDialog: AlertDialog = builder.create()
        alertDialog.setCancelable(false)
        alertDialog.show()
    }
}