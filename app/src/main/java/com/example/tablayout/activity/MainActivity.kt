package com.example.tablayout.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tablayout.R
import com.example.tablayout.controller.ViewPagerAdapter
import com.example.tablayout.fragment.parent.AFragment
import com.example.tablayout.fragment.parent.BFragment
import com.example.tablayout.fragment.parent.CFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(AFragment(), "碎片A")
        adapter.addFragment(BFragment(), "碎片B")
        adapter.addFragment(CFragment(), "碎片C")
        viewPager.adapter = adapter
        tabLayout.setupWithViewPager(viewPager)
    }
}
