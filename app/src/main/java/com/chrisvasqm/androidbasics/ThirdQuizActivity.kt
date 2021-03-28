package com.chrisvasqm.androidbasics

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

class ThirdQuizActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third_quiz)

//        btnPreviousThird.setOnClickListener { finish() }
//        btnNextThird.setOnClickListener {
//            checkAnswer()
//            showFourthQuiz()
//        }
    }

    private fun showSecondQuiz() {
        startActivity<SecondQuizActivity>()
    }

    private fun checkAnswer() {
//        if (editAuthorName.text.toString() == getString(R.string.clean_code_author_name))
//            toast(R.string.correct)
//        else
//            toast(R.string.wrong)
    }

    private fun showFourthQuiz() {
        startActivity<FourthQuizActivity>()
    }

}
