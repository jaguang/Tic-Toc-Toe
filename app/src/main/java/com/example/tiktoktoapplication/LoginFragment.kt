package com.example.tiktoktoapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment : Fragment(),View.OnClickListener {
    private lateinit var navController: NavController

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

        navController = Navigation.findNavController(view)
        submit_button.setOnClickListener(this)
    }

    fun lgoinPlayer(player1: String, player2: String) {
        PLAYER1_PARAM = player1
        PLAYER2_PARAM = player2
    }

    companion object {
     @JvmStatic
        fun newInstance() = LoginFragment()
    }

    override fun onClick(p0: View?) {
        val player1Text = player_1.text
        val player2Text = player_2.text
        lgoinPlayer(
                player1 = player1Text.toString(),
                player2 = player2Text.toString()
        )
        when(p0) {
            submit_button -> navController.navigate(R.id.action_loginFragment_to_boardFragment)
        }
    }
}