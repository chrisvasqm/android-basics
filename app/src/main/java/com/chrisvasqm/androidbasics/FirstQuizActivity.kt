package com.chrisvasqm.androidbasics

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_first_quiz.*
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

class FirstQuizActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_quiz)

        btnNextFirst.setOnClickListener {
            checkAnswer()
            showSecondQuiz()
        }
    }

    private fun showSecondQuiz() {
        startActivity<SecondQuizActivity>()
    }

    private fun checkAnswer() {
        if (!radioAnyAmount.isChecked)
            toast(R.string.wrong)
        else
            toast(R.string.correct)
    }

}
