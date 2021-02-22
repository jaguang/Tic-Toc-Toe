package com.example.tiktoktoapplication

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_board.*

class BoardFragment : Fragment() {

    var player1 = PLAYER1_PARAM
    var player2 = PLAYER2_PARAM
    var activePlayer = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activePlayer = player1

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_board, container, false)
    }

    fun showPlayerTurn(comand: String) {
        view_player.text = activePlayer + comand
    }

    fun click(view: View) {
        val buttonSelected = view as Button
        var butonId = 0
        when (buttonSelected.id) {
            R.id.button1 -> butonId = 1
            R.id.button2 -> butonId = 2
            R.id.button3 -> butonId = 3
            R.id.button4 -> butonId = 4
            R.id.button5 -> butonId = 5
            R.id.button6 -> butonId = 6
            R.id.button7 -> butonId = 7
            R.id.button8 -> butonId = 8
            R.id.button9 -> butonId = 9
        }
        selectMark(buttonSelected,butonId)
    }


    private fun selectMark(buttonSelected: Button, buttonId:Int) {
        if(activePlayer == player1) {
            buttonSelected.text = "x"
            buttonSelected.setBackgroundColor(Color.GREEN)
            moveP1.add(buttonId)
            activePlayer = player2
            showPlayerTurn(" turn ")

        } else {
            buttonSelected.text = "o"
            buttonSelected.setBackgroundColor(Color.RED)
            moveP2.add(buttonId)
            activePlayer = player1
            showPlayerTurn(" turn ")
        }
        CheckWinner()
    }

    fun CheckWinner()
    {
        var winner = -1

        //row1
        if (moveP1.contains(1) && moveP1.contains(2) && moveP1.contains(3))
        {
            winner = 1
        }
        if (moveP2.contains(1) && moveP2.contains(2) && moveP2.contains(3))
        {
            winner = 2
        }

        //row2
        if (moveP1.contains(4) && moveP1.contains(5) && moveP1.contains(6))
        {
            winner = 1
        }
        if (moveP2.contains(4) && moveP2.contains(5) && moveP2.contains(6))
        {
            winner = 2
        }

        //row3
        if (moveP1.contains(7) && moveP1.contains(8) && moveP1.contains(9))
        {
            winner = 1
        }
        if (moveP2.contains(7) && moveP2.contains(8) && moveP2.contains(9))
        {
            winner = 2
        }

        //col1
        if (moveP1.contains(1) && moveP1.contains(4) && moveP1.contains(7))
        {
            winner = 1
        }
        if (moveP2.contains(1) && moveP2.contains(4) && moveP2.contains(7))
        {
            winner = 2
        }

        //col2
        if (moveP1.contains(2) && moveP1.contains(5) && moveP1.contains(8))
        {
            winner = 1
        }
        if (moveP2.contains(2) && moveP2.contains(5) && moveP2.contains(8))
        {
            winner = 2
        }

        //col3
        if (moveP1.contains(3) && moveP1.contains(6) && moveP1.contains(9))
        {
            winner = 1
        }
        if (moveP2.contains(3) && moveP2.contains(6) && moveP2.contains(9))
        {
            winner = 2
        }

        //cross1
        if (moveP1.contains(1) && moveP1.contains(5) && moveP1.contains(9))
        {
            winner = 1
        }
        if (moveP2.contains(1) && moveP2.contains(5) && moveP2.contains(9))
        {
            winner = 2
        }

        //cross2
        if (moveP1.contains(3) && moveP1.contains(5) && moveP1.contains(7))
        {
            winner = 1
        }
        if (moveP2.contains(3) && moveP2.contains(5) && moveP2.contains(7))
        {
            winner = 2
        }

        if (winner != -1)
        {
            if (winner == 1)
            {
                Toast.makeText(activity, "Player 1 Wins!!", Toast.LENGTH_SHORT).show()

            }
            else
            {
                Toast.makeText(activity, "Player 2 Wins!!", Toast.LENGTH_SHORT).show()

            }
        }
    }


    companion object {
      @JvmStatic
        fun newInstance() = BoardFragment()
    }
}