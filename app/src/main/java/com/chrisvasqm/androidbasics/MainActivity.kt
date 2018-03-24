package com.chrisvasqm.androidbasics

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPlusOneA.setOnClickListener { plusOnePoints(scoreTeamA) }
        btnPlusTwoA.setOnClickListener { plusTwoPoints(scoreTeamA) }
        btnPlusThreeA.setOnClickListener { plusThreePoints(scoreTeamA) }

        btnPlusOneB.setOnClickListener { plusOnePoints(scoreTeamB) }
        btnPlusTwoB.setOnClickListener { plusTwoPoints(scoreTeamB) }
        btnPlusThreeB.setOnClickListener { plusThreePoints(scoreTeamB) }

        btnReset.setOnClickListener { resetScores() }
    }

    private fun plusOnePoints(textView: TextView) {
        val score = textView.text.toString().toInt() + 1
        textView.text = score.toString()
    }

    private fun plusTwoPoints(textView: TextView) {
        val score = textView.text.toString().toInt() + 2
        textView.text = score.toString()
    }

    private fun plusThreePoints(textView: TextView) {
        val score = textView.text.toString().toInt() + 3
        textView.text = score.toString()
    }

    private fun resetScores() {
        scoreTeamA.text = "0"
        scoreTeamB.text = "0"
    }

}
