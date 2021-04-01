package com.example.quran_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.quran_calculator.databinding.ActivityMainBinding
import com.example.quran_calculator.fragments.CalculatorFragment
import com.example.quran_calculator.fragments.CounterFragment
import com.example.quran_calculator.fragments.adapters.ViewPagerAdapter
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        setUpTabs()
    }

    private fun setUpTabs() {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(CalculatorFragment(), "Калькулятор")
        adapter.addFragment(CounterFragment(), "Счетчик")

        val viewPager = findViewById<ViewPager>(R.id.viewPager)
        val tabs = findViewById<TabLayout>(R.id.tabs)
        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)

        tabs.getTabAt(0)!!.setIcon(R.drawable.ic_baseline_calculate_24)
        tabs.getTabAt(1)!!.setIcon(R.drawable.ic_baseline_fingerprint_24)

    }
}