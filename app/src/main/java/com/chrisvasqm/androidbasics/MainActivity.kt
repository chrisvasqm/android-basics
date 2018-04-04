package com.chrisvasqm.androidbasics

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import com.chrisvasqm.androidbasics.model.Score
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val scoreA = Score()
        btnPlusOneA.setOnClickListener { increaseOnePoint(scoreA, textScoreTeamA) }
        btnPlusTwoA.setOnClickListener { increaseTwoPoints(scoreA, textScoreTeamA) }
        btnPlusThreeA.setOnClickListener { increaseThreePoints(scoreA, textScoreTeamA) }

        val scoreB = Score()
        btnPlusOneB.setOnClickListener { increaseOnePoint(scoreB, textScoreTeamB) }
        btnPlusTwoB.setOnClickListener { increaseTwoPoints(scoreB, textScoreTeamB) }
        btnPlusThreeB.setOnClickListener { increaseThreePoints(scoreB, textScoreTeamB) }

        btnReset.setOnClickListener { resetScores(scoreA, scoreB) }
    }

    private fun increaseOnePoint(score: Score, textView: TextView) {
        score.increaseBy(1)
        textView.text = score.points.toString()
    }

    private fun increaseTwoPoints(score: Score, textView: TextView) {
        score.increaseBy(2)
        textView.text = score.points.toString()
    }

    private fun increaseThreePoints(score: Score, textView: TextView) {
        score.increaseBy(3)
        textView.text = score.points.toString()
    }

    private fun resetScores(scoreA: Score, scoreB: Score) {
        scoreA.reset()
        textScoreTeamA.text = scoreA.points.toString()

        scoreB.reset()
        textScoreTeamB.text = scoreB.points.toString()
    }

}
