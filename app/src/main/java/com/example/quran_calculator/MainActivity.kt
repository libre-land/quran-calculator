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
            var result = 0

            fun mathResult(result: Int): Any {
                val pageInput = bindingClass.tvPageInput.text.toString().toInt()
                val prayerInput = bindingClass.tvPrayerInput.text.toString().toInt()
                val dayInput = bindingClass.tvDayInput.text.toString().toInt()
                bindingClass.tvResult.visibility = View.VISIBLE

                var result = try {
                    (pageInput / prayerInput) / dayInput
                }
                catch (ex: Exception) {
                }

                return result
            }

            when(mathResult(result)) {
                1 -> {
                    bindingClass.tvResult.text = "Вы должны читать ${mathResult(result)} страницу в каждой молитве"
                }

                in 2..4 -> {
                    bindingClass.tvResult.text = "Вы должны читать ${mathResult(result)} страницы в каждой молитве"
                }

                in 5..100000 -> {
                    bindingClass.tvResult.text = "Вы должны читать ${mathResult(result)} страниц в каждой молитве"
                }

                else -> {
                    bindingClass.tvResult.text = "Не удалось вычислить"
                    bindingClass.tvResult.visibility = View.VISIBLE
                }
            }
        }
    }
}