package com.example.tablayout.fragment.child.a

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.tablayout.R
import com.example.tablayout.controller.ViewPagerAdapter
import com.example.tablayout.fragment.child.b.BChildFragmentA
import com.example.tablayout.fragment.child.c.CChildFragmentA
import kotlinx.android.synthetic.main.fragment_a.*

class AChildFragmentB : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState:
    Bundle?): View? = inflater.inflate(R.layout.fragment_a, container, false)
}
