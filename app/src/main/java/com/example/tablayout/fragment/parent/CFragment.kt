package com.example.tablayout.fragment.parent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.tablayout.R
import com.example.tablayout.controller.ViewPagerAdapter
import com.example.tablayout.fragment.child.c.CChildFragmentA
import com.example.tablayout.fragment.child.c.CChildFragmentB
import com.example.tablayout.fragment.child.c.CChildFragmentC
import kotlinx.android.synthetic.main.fragment_c.*

class CFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState:
    Bundle?): View? = inflater.inflate(R.layout.fragment_c, container, false)

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val adapter = ViewPagerAdapter(childFragmentManager)
        adapter.addFragment(CChildFragmentA(), "C碎片的子碎片A")
        adapter.addFragment(CChildFragmentB(), "C碎片的子碎片B")
        adapter.addFragment(CChildFragmentC(), "C碎片的子碎片C")
        viewPagerFC.adapter = adapter
        fragmentCTabLayout.setupWithViewPager(viewPagerFC)
    }
}
