package com.example.myapplication.Activities.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.myapplication.R
import kotlinx.android.synthetic.main.fragment_welcome.*

class WelcomeFragment:Fragment(){

    /*override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)





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
    }*/

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_welcome, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_login_welcomeactivity.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.next_action)
        }
        btn_register_welcomeactivity.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.next_action2)
        }
    }


}
