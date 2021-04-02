package com.example.quran_calculator.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.TextView
import com.example.quran_calculator.R

class CounterFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v: View = inflater.inflate(R.layout.fragment_counter, container, false)

        var tvCounter = v.findViewById<TextView>(R.id.tvCounter)
        val counterPage = v.findViewById<RelativeLayout>(R.id.counterPage)
        var count = 0

        counterPage.setOnClickListener {
            count++
            tvCounter.text = count.toString()
        }

        return v
    }
}