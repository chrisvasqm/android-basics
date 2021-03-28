package com.chrisvasqm.androidbasics

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

class FourthQuizActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth_quiz)

//        btnPreviousFourth.setOnClickListener { finish() }
//        btnSubmit.setOnClickListener {
//            checkAnswer()
//        }
    }

    private fun checkAnswer() {
//        if (editAndroidName.text.toString() == getString(R.string.founder_android))
//            toast(R.string.correct)
//        else
//            toast(R.string.wrong)
    }

    private fun showThirdQuiz() {
//        startActivity<ThirdQuizActivity>()
    }
}
