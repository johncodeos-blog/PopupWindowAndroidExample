package com.example.popupwindowexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        show_btn.setOnClickListener {
            val intent = Intent(this, PopUpWindow::class.java)
            intent.putExtra("popuptitle", "Error")
            intent.putExtra("popuptext", "Sorry, that email address is already used!")
            intent.putExtra("popupbtn", "OK")
            intent.putExtra("darkstatusbar", false)
            startActivity(intent)
        }
    }
}
