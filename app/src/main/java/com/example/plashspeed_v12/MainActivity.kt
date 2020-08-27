package com.example.plashspeed_v12

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        login_button.setOnClickListener{
            var status = if(username_et.text.toString().equals("chankarchun")
                &&password_et.text.toString().equals("123")) "Logged In Successfully" else "Username or Password is incorrect"
            Toast.makeText(this,status,Toast.LENGTH_SHORT).show()
        }

        btnBack.setOnClickListener{
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}