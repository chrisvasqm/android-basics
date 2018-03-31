package com.chrisvasqm.androidbasics

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second_quiz.*
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

class SecondQuizActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_quiz)

        btnPreviousSecond.setOnClickListener { finish() }
        btnNextSecond.setOnClickListener {
            checkAnswer()
            showThirdQuiz()
        }
    }

    private fun showFirstQuiz() {
        startActivity<FirstQuizActivity>()
    }

    private fun checkAnswer() {
        if (checkEncapsulation.isChecked
                and checkPolymorphism.isChecked
                and checkInheritance.isChecked
                and checkAbstraction.isChecked)
            toast(R.string.correct)
        else
            toast(R.string.wrong)
    }

    private fun showThirdQuiz() {
        startActivity<ThirdQuizActivity>()
    }

}
