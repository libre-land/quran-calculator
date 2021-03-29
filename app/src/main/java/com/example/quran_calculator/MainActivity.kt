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

            bindingClass.tvResult.text = "Вы должны читать ${result} страниц в каждой молитве"
            bindingClass.tvResult.visibility = View.VISIBLE
        }

    }
}