package com.example.tablayout.fragment.parent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.tablayout.R
import com.example.tablayout.controller.ViewPagerAdapter
import com.example.tablayout.fragment.child.b.BChildFragmentA
import com.example.tablayout.fragment.child.b.BChildFragmentB
import com.example.tablayout.fragment.child.b.BChildFragmentC
import kotlinx.android.synthetic.main.fragment_b.*

class BFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState:
    Bundle?): View? = inflater.inflate(R.layout.fragment_b, container, false)

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val adapter = ViewPagerAdapter(childFragmentManager)
        adapter.addFragment(BChildFragmentA(), "B碎片的子碎片A")
        adapter.addFragment(BChildFragmentB(), "B碎片的子碎片B")
        adapter.addFragment(BChildFragmentC(), "B碎片的子碎片C")
        viewPagerFB.adapter = adapter
        fragmentBTabLayout.setupWithViewPager(viewPagerFB)
    }
}
