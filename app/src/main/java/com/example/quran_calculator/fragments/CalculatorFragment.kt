package com.example.quran_calculator.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.quran_calculator.R

class CalculatorFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v: View = inflater.inflate(R.layout.fragment_calculator, container, false)
        var resultButton = v.findViewById<Button>(R.id.resultButton)

        resultButton.setOnClickListener {
            val pageInput = v.findViewById<EditText>(R.id.tvPageInput).text.toString().toInt()
            val prayerInput = v.findViewById<EditText>(R.id.tvPrayerInput).text.toString().toInt()
            val dayInput = v.findViewById<EditText>(R.id.tvDayInput).text.toString().toInt()
            val tvResult = v.findViewById<TextView>(R.id.tvResult)

            var result = 0

            fun mathResult(result: Int): Any {
                tvResult.visibility = View.VISIBLE

                var result = try {
                    (pageInput / prayerInput) / dayInput
                } catch (ex: Exception) {
                }

                return result
            }

            when (mathResult(result)) {
                1 -> {
                    tvResult.text = "Вы должны читать ${mathResult(result)} страницу в каждой молитве"
                }

                in 2..4 -> {
                    tvResult.text = "Вы должны читать ${mathResult(result)} страницы в каждой молитве"
                }

                in 5..100000 -> {
                    tvResult.text = "Вы должны читать ${mathResult(result)} страниц в каждой молитве"
                }

                else -> {
                    tvResult.text = "Не удалось вычислить"
                    tvResult.visibility = View.VISIBLE
                }
            }
        }

        return v
    }
}