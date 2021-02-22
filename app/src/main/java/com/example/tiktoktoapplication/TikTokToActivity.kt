//package com.example.tiktoktoapplication
//
//import android.graphics.Color
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.view.View
//import android.widget.Button
//import android.widget.TextView
//import android.widget.Toast
//import androidx.core.content.ContextCompat
//import kotlinx.android.synthetic.main.activity_main.*
//import kotlinx.android.synthetic.main.activity_tik_tok_to.*
//import kotlin.math.log
//
//class TikTokToActivity : AppCompatActivity() {
//    var player1 = ""
//    var player2 = ""
//    var activePlayer = ""
//    var moveP1 = arrayListOf<Int>()
//    var moveP2 = arrayListOf<Int>()
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_tik_tok_to)
//        player1 = intent.getStringExtra(MainActivity.PLAYER_1)
//        player2 = intent.getStringExtra(MainActivity.PLAYER_2)
//
//        activePlayer = player1
//
//    }
//
//    private fun showPlayerTurn(comand: String) {
//        player_name.text = activePlayer + comand
//    }
//
////    private fun switchPlayer() {
////        if (activePlayer == player1) {
////            activePlayer = player2
////        } else {
////            activePlayer = player1
////        }
////    }
//
//    fun click(view: View) {
//        val buttonSelected = view as Button
//        var butonId = 0
//        when (buttonSelected.id) {
//            R.id.button_1 -> butonId = 1
//            R.id.button_2 -> butonId = 2
//            R.id.button_3 -> butonId = 3
//            R.id.button_4 -> butonId = 4
//            R.id.button_5 -> butonId = 5
//            R.id.button_6 -> butonId = 6
//            R.id.button_7 -> butonId = 7
//            R.id.button_8 -> butonId = 8
//            R.id.button_9 -> butonId = 9
//        }
//        selectMark(buttonSelected,butonId)
//    }
//
//
//    private fun selectMark(buttonSelected: Button,buttonId:Int) {
//        if(activePlayer == player1) {
//            buttonSelected.text = "x"
//            buttonSelected.setBackgroundColor(Color.GREEN)
//            moveP1.add(buttonId)
//            activePlayer = player2
//            showPlayerTurn(" turn ")
//
//        } else {
//            buttonSelected.text = "o"
//            buttonSelected.setBackgroundColor(Color.RED)
//            moveP2.add(buttonId)
//            activePlayer = player1
//            showPlayerTurn(" turn ")
//        }
//        CheckWinner()
//    }
//
//    fun CheckWinner()
//    {
//        var winner = -1
//
//        //row1
//        if (moveP1.contains(1) && moveP1.contains(2) && moveP1.contains(3))
//        {
//            winner = 1
//        }
//        if (moveP2.contains(1) && moveP2.contains(2) && moveP2.contains(3))
//        {
//            winner = 2
//        }
//
//        //row2
//        if (moveP1.contains(4) && moveP1.contains(5) && moveP1.contains(6))
//        {
//            winner = 1
//        }
//        if (moveP2.contains(4) && moveP2.contains(5) && moveP2.contains(6))
//        {
//            winner = 2
//        }
//
//        //row3
//        if (moveP1.contains(7) && moveP1.contains(8) && moveP1.contains(9))
//        {
//            winner = 1
//        }
//        if (moveP2.contains(7) && moveP2.contains(8) && moveP2.contains(9))
//        {
//            winner = 2
//        }
//
//        //col1
//        if (moveP1.contains(1) && moveP1.contains(4) && moveP1.contains(7))
//        {
//            winner = 1
//        }
//        if (moveP2.contains(1) && moveP2.contains(4) && moveP2.contains(7))
//        {
//            winner = 2
//        }
//
//        //col2
//        if (moveP1.contains(2) && moveP1.contains(5) && moveP1.contains(8))
//        {
//            winner = 1
//        }
//        if (moveP2.contains(2) && moveP2.contains(5) && moveP2.contains(8))
//        {
//            winner = 2
//        }
//
//        //col3
//        if (moveP1.contains(3) && moveP1.contains(6) && moveP1.contains(9))
//        {
//            winner = 1
//        }
//        if (moveP2.contains(3) && moveP2.contains(6) && moveP2.contains(9))
//        {
//            winner = 2
//        }
//
//        //cross1
//        if (moveP1.contains(1) && moveP1.contains(5) && moveP1.contains(9))
//        {
//            winner = 1
//        }
//        if (moveP2.contains(1) && moveP2.contains(5) && moveP2.contains(9))
//        {
//            winner = 2
//        }
//
//        //cross2
//        if (moveP1.contains(3) && moveP1.contains(5) && moveP1.contains(7))
//        {
//            winner = 1
//        }
//        if (moveP2.contains(3) && moveP2.contains(5) && moveP2.contains(7))
//        {
//            winner = 2
//        }
//
//        if (winner != -1)
//        {
//            if (winner == 1)
//            {
//                Toast.makeText(this, "Player 1 Wins!!", Toast.LENGTH_SHORT).show()
//
//            }
//            else
//            {
//                Toast.makeText(this, "Player 2 Wins!!", Toast.LENGTH_SHORT).show()
//
//            }
//        }
//    }
//
//}
