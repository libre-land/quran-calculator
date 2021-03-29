package com.example.quran_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.quran_calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.resultButton.setOnClickListener {
            val pageInput = bindingClass.tvPageInput.text.toString().toInt()
            val prayerInput = bindingClass.tvPrayerInput.text.toString().toInt()
            val result = pageInput/prayerInput

            when(result) {
                1 -> {
                    bindingClass.tvResult.text = "Вы должны читать ${result} страницу в каждой молитве"
                    bindingClass.tvResult.visibility = View.VISIBLE
                }

                in 2.. 4 -> {
                    bindingClass.tvResult.text = "Вы должны читать ${result} страницы в каждой молитве"
                    bindingClass.tvResult.visibility = View.VISIBLE
                }

                in 5..100000 -> {
                    bindingClass.tvResult.text = "Вы должны читать ${result} страниц в каждой молитве"
                    bindingClass.tvResult.visibility = View.VISIBLE
                }

                else -> {
                    bindingClass.tvResult.text = "Результат не известен"
                    bindingClass.tvResult.visibility = View.VISIBLE
                }
            }

        }

    }
}