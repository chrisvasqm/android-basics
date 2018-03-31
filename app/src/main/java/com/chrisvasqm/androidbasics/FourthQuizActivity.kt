package com.chrisvasqm.androidbasics

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_fourth_quiz.*
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

class FourthQuizActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth_quiz)

        btnPreviousFourth.setOnClickListener { finish() }
        btnSubmit.setOnClickListener {
            checkAnswer()
        }
    }

    private fun checkAnswer() {
        if (editAndroidName.text.toString() == getString(R.string.founder_android))
            toast(R.string.correct)
        else
            toast(R.string.wrong)
    }

    private fun showThirdQuiz() {
        startActivity<ThirdQuizActivity>()
    }
}
