package com.fotobom.androidtraining_alin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.android.material.floatingactionbutton.FloatingActionButton

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        val toastBtn = findViewById<FloatingActionButton>(R.id.toastButton)
        toastBtn.setOnClickListener{
            showToast()
        }

        val button = findViewById<Button>(R.id.cilckhere_button)
        button.setOnClickListener {
            showAlert()
        }
    }

    /** Function to show toast message after button click */
    fun showToast(){
        val inputId = findViewById<EditText>(R.id.toastInput)
        val toastMsg = inputId.text.toString()
        val toast = Toast.makeText(applicationContext, toastMsg, Toast.LENGTH_SHORT)
        toast.show()
    }

    /** Function to show alert dialog box after button click.  */
    private fun showAlert(){

        val inputId = findViewById<EditText>(R.id.text_input)
        val toastMsg = inputId.text.toString()
        val builder = AlertDialog.Builder(this)
        builder.setTitle(R.string.dialogTitle)
        builder.setMessage(R.string.dialogMessage)
        builder.setIcon(android.R.drawable.ic_dialog_alert)
        builder.setPositiveButton("Yes"){dialogInterface, which ->
            Toast.makeText(applicationContext,toastMsg,Toast.LENGTH_LONG).show()
        }
        builder.setNeutralButton("Cancel"){dialogInterface , which ->
            Toast.makeText(applicationContext,"Clicked cancel\n Operation cancelled.",Toast.LENGTH_LONG).show()
        }
        builder.setNegativeButton("No"){dialogInterface, which ->
            Toast.makeText(applicationContext,"Clicked No",Toast.LENGTH_LONG).show()
        }
        val alertDialog: AlertDialog = builder.create()
        alertDialog.setCancelable(false)
        alertDialog.show()
    }
}