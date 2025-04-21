package com.example.datepicker

import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Calendar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val datePicker: DatePicker = findViewById(R.id.Kalender)




        val button : Button = findViewById(R.id.Toast)
        val button2 : Button = findViewById(R.id.Button)

        button.setOnClickListener {
            val hari = datePicker.dayOfMonth
            val bulan = datePicker.month
            val tahun = datePicker.year

            Toast.makeText(this , "Hari Ini $hari , $bulan , $tahun ", Toast.LENGTH_SHORT).show()
        }

        button2.setOnClickListener {

            val builder = AlertDialog.Builder(this)
            builder.setMessage("Do you want to exit ?")
            builder.setTitle("Alert !")
            builder.setCancelable(false)

            builder.setPositiveButton("Yes") {
                    dialog, which -> finish()
            }

            builder.setNegativeButton("No") {
                    dialog, which -> dialog.cancel()
            }


            val alertDialog = builder.create()

            alertDialog.show()

        }


    }
}