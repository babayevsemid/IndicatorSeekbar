package com.warkiz.indicatorseekbar.fragment

import android.view.View
import com.warkiz.indicatorseekbar.R
import com.warkiz.widget.IndicatorSeekBar

class IndicatorFragment : BaseFragment() {
    override fun getLayoutId(): Int {
        return R.layout.custom_indicator
    }

    override fun initView(root: View) {
        //custom indicator text by java code
        val seekBarWithProgress =
            root.findViewById<IndicatorSeekBar>(R.id.custom_indicator_by_java_code)
        seekBarWithProgress.setIndicatorTextFormat("\${PROGRESS} %")

        //custom indicator text by java code
        val seekBarWithTickText = root.findViewById<IndicatorSeekBar>(R.id.custom_indicator_by_java)
        seekBarWithTickText.setIndicatorTextFormat("\${TICK_TEXT} --")
    }
}
