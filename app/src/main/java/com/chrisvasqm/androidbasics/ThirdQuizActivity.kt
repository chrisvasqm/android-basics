package com.chrisvasqm.androidbasics

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_third_quiz.*
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

class ThirdQuizActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third_quiz)

        btnPreviousThird.setOnClickListener { showSecondQuiz() }
        btnNextThird.setOnClickListener {
            checkAnswer()
        }
    }

    private fun showSecondQuiz() {
        startActivity<SecondQuizActivity>()
    }

    private fun checkAnswer() {
        if (editAuthorName.text.toString() == getString(R.string.clean_code_author_name))
            toast(R.string.correct)
        else
            toast(R.string.wrong)
    }

}
