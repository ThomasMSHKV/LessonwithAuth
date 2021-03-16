package com.example.spictures.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.spictures.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val username = username.text
        val password = password.text
        val loginBtn = loginBtn

        loginBtn.setOnClickListener {
            if(username.isEmpty() || password.isEmpty()){
                Toast.makeText(requireContext(), "Please fill in the field", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            fragmentManager?.beginTransaction()
                ?.replace(R.id.fragmentContainer, HomeFragment())
                ?.commit()

            }
        }

    }
