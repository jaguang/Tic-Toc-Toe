package com.example.tiktoktoapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment(private val loginInterface: LoginInterface) : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        submit_button.setOnClickListener {
            val player1Text = player_1.text
            val player2Text = player_2.text
            loginInterface.lgoinPlayer(
                    player1 = player1Text.toString(),
                    player2 = player2Text.toString()
            )
        }
    }

    companion object {
     @JvmStatic
        fun newInstance(loginInterface: LoginInterface) = LoginFragment(loginInterface)
    }
}