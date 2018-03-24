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

        btnPlusOneB.setOnClickListener { plusOnePoints(scoreTeamB) }
    }

    private fun plusOnePoints(textView: TextView) {
        val score = textView.text.toString().toInt() + 1
        textView.text = score.toString()
    }

}
