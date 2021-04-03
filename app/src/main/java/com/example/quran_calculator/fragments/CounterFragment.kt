package com.example.quran_calculator.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.quran_calculator.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class CounterFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v: View = inflater.inflate(R.layout.fragment_counter, container, false)

        val counterPage = v.findViewById<ConstraintLayout>(R.id.counterPage)
        val tvCounter = v.findViewById<TextView>(R.id.tvCounter)
        val zeroButton = v.findViewById<FloatingActionButton>(R.id.zeroButton)
        var counter = 0

        counterPage.setOnClickListener {
            counter++
            tvCounter.text = counter.toString()
        }

        zeroButton.setOnClickListener {
            counter = 0
            tvCounter.text = counter.toString()
        }
        return v
    }
}