package com.chrisvasqm.androidbasics

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.chrisvasqm.androidbasics.databinding.ActivityFirstQuizBinding
import org.jetbrains.anko.toast

class FirstQuizActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFirstQuizBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFirstQuizBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNextFirst.setOnClickListener {
            checkAnswer()
            showSecondQuiz()
        }
    }

    private fun showSecondQuiz() {
        val intent = Intent(this, SecondQuizActivity::class.java)
        startActivity(intent)
    }

    private fun checkAnswer() {
        if (binding.radioAnyAmount.isChecked)
            toast(R.string.wrong)
        else
            toast(R.string.correct)
    }

}
