package com.example.tablayout.fragment.child.c

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.tablayout.R
import com.example.tablayout.controller.ViewPagerAdapter
import com.example.tablayout.fragment.child.a.AChildFragmentA
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_a.*

class CChildFragmentA : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState:
    Bundle?): View? = inflater.inflate(R.layout.fragment_c, container, false)
}

