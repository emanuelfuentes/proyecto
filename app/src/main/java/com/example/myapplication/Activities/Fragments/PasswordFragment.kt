package com.example.myapplication.Activities.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.myapplication.R
import kotlinx.android.synthetic.main.fragment_register_pw.*

class PasswordFragment:Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?):
            View? {
        return inflater.inflate(R.layout.fragment_register_pw, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        et_password_register_pw.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.next_action)
        }

    }



}