package com.chrisvasqm.androidbasics

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.chrisvasqm.androidbasics.databinding.ActivityThirdQuizBinding
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

class ThirdQuizActivity : AppCompatActivity() {

    private lateinit var binding: ActivityThirdQuizBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdQuizBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPreviousThird.setOnClickListener { showSecondQuiz() }
        binding.btnNextThird.setOnClickListener {
            checkAnswer()
            showFourthQuiz()
        }
    }

    private fun showSecondQuiz() {
        startActivity<SecondQuizActivity>()
    }

    private fun checkAnswer() {
        if (binding.editAuthorName.text.toString() == getString(R.string.clean_code_author_name))
            toast(R.string.correct)
        else
            toast(R.string.wrong)
    }

    private fun showFourthQuiz() {
        startActivity<FourthQuizActivity>()
    }

}
