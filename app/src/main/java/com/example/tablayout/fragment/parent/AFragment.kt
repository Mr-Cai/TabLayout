package com.example.tablayout.fragment.parent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.tablayout.R
import com.example.tablayout.controller.ViewPagerAdapter
import com.example.tablayout.fragment.child.a.AChildFragmentA
import com.example.tablayout.fragment.child.a.AChildFragmentB
import com.example.tablayout.fragment.child.a.AChildFragmentC
import kotlinx.android.synthetic.main.fragment_a.*

class AFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState:
    Bundle?): View? = inflater.inflate(R.layout.fragment_a, container, false)

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val adapter = ViewPagerAdapter(childFragmentManager)
        adapter.addFragment(AChildFragmentA(), "碎片A的子碎片A")
        adapter.addFragment(AChildFragmentB(), "碎片A的子碎片B")
        adapter.addFragment(AChildFragmentC(), "碎片A的子碎片C")
        viewPagerFA.adapter = adapter
        fragmentATabLayout.setupWithViewPager(viewPagerFA)
    }
}
