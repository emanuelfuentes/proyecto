package com.example.myapplication.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import com.example.myapplication.Activities.Fragments.NameFragment
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_welcome.*
import javax.security.auth.login.LoginException

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)


        btn_login_welcomeactivity.setOnClickListener {
            val intent = Intent(this, LoginException::class.java)
            // start your next activity
            startActivity(intent)
        }
        btn_register_welcomeactivity.setOnClickListener {
            val intent = Intent(this, NameFragment::class.java)
            // start your next activity
            startActivity(intent)
        }
    }


}
