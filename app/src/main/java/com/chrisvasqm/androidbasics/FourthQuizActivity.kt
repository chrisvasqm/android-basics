package com.chrisvasqm.androidbasics

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.chrisvasqm.androidbasics.databinding.ActivityFourthQuizBinding
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

class FourthQuizActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFourthQuizBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFourthQuizBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPreviousFourth.setOnClickListener { showThirdQuiz() }
        binding.btnSubmit.setOnClickListener { checkAnswer() }
    }

    private fun checkAnswer() {
        if (binding.editAndroidName.text.toString() == getString(R.string.founder_android))
            toast(R.string.correct)
        else
            toast(R.string.wrong)
    }

    private fun showThirdQuiz() {
        startActivity<ThirdQuizActivity>()
    }
}
