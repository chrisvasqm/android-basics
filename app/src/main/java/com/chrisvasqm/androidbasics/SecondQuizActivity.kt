package com.chrisvasqm.androidbasics

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.chrisvasqm.androidbasics.databinding.ActivitySecondQuizBinding
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

class SecondQuizActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondQuizBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySecondQuizBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnPreviousSecond.setOnClickListener { finish() }
        binding.btnNextSecond.setOnClickListener {
            checkAnswer()
            showThirdQuiz()
        }
    }

    private fun showFirstQuiz() {
        startActivity<FirstQuizActivity>()
    }

    private fun checkAnswer() {
        if (binding.checkEncapsulation.isChecked
                and binding.checkPolymorphism.isChecked
                and binding.checkInheritance.isChecked
                and binding.checkAbstraction.isChecked)
            toast(R.string.correct)
        else
            toast(R.string.wrong)
    }

    private fun showThirdQuiz() {
        startActivity<ThirdQuizActivity>()
    }

}
