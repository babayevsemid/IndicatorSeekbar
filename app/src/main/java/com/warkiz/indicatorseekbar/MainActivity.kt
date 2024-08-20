package com.warkiz.indicatorseekbar

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView
import com.warkiz.indicatorseekbar.fragment.ContinuousFragment
import com.warkiz.indicatorseekbar.fragment.CustomFragment
import com.warkiz.indicatorseekbar.fragment.DiscreteFragment
import com.warkiz.indicatorseekbar.fragment.IndicatorFragment
import com.warkiz.indicatorseekbar.fragment.JavaBuildFragment

/**
 * created by zhuangguangquan on 2017/9/6
 */
class MainActivity : AppCompatActivity() {
    private val mFragmentList: MutableList<Fragment> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initFragment()
        initViews()
    }

    private fun initFragment() {
        mFragmentList.add(ContinuousFragment())
        mFragmentList.add(DiscreteFragment())
        mFragmentList.add(CustomFragment())
        mFragmentList.add(JavaBuildFragment())
        mFragmentList.add(IndicatorFragment())
    }

    private fun initViews() {
        val viewPager = findViewById<View>(R.id.viewPager) as ViewPager
        val tabLayout = findViewById<View>(R.id.tabLayout) as TabLayout

        viewPager.adapter = PagerAdapter(
            supportFragmentManager
        )
        tabLayout.setupWithViewPager(viewPager)

        for (s in sType) {
            val textView = TextView(this)
            textView.text = s
            tabLayout.newTab().setCustomView(textView)
        }
    }

    private inner class PagerAdapter(fm: FragmentManager?) : FragmentPagerAdapter(fm) {
        override fun getItem(position: Int): Fragment {
            return mFragmentList[position]
        }

        override fun getCount(): Int {
            return sType.size
        }

        override fun getPageTitle(position: Int): CharSequence? {
            return sType[position]
        }
    }

    companion object {
        private val sType =
            arrayOf("continuous", "discrete", "custom", "java", "indicator")
    }
}
