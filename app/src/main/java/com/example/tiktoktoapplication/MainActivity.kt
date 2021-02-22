package com.example.tiktoktoapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),LoginInterface {
    private lateinit var boardFragment: BoardFragment
    private lateinit var loginFragment: LoginFragment


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loginFragment = LoginFragment.newInstance(this)
        switchFragment(loginFragment)
    }

    fun switchFragment(fragment:Fragment){
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container,fragment).commit()
    }

    override fun lgoinPlayer(player1: String, player2: String) {
        boardFragment = BoardFragment()
        intent.putExtra(PLAYER1_PARAM,player1)
        intent.putExtra(PLAYER2_PARAM,player2)
//        var bundle= Bundle()
//        bundle.putString(PLAYER1_PARAM,player1)
//        bundle.putString(PLAYER2_PARAM,player2)
//        boardFragment.arguments = bundle
        switchFragment(boardFragment)
    }


}