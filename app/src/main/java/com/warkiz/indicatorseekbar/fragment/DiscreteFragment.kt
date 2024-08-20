package com.warkiz.indicatorseekbar.fragment

import android.graphics.Color
import android.view.View
import android.widget.TextView
import com.warkiz.indicatorseekbar.R
import com.warkiz.widget.ColorCollector
import com.warkiz.widget.IndicatorSeekBar
import com.warkiz.widget.OnSeekChangeListener
import com.warkiz.widget.SeekParams

/**
 * created by zhuangguangquan on  2017/9/6
 */
class DiscreteFragment : BaseFragment() {
    override fun getLayoutId(): Int {
        return R.layout.discrete
    }

    override fun initView(root: View) {
        //customTickTexts
        val seekBar = root.findViewById<IndicatorSeekBar>(R.id.custom_text)
        val arr = arrayOf("A", "a", "B", "b", "C", "c", "D")
        seekBar.customTickTexts(arr)

        //tick_drawable
        val tick_drawable = root.findViewById<IndicatorSeekBar>(R.id.tick_drawable)
        tick_drawable.setTickMarksDrawable(resources.getDrawable(R.mipmap.ic_launcher))

        //custom section color
        val sectionSeekBar = root.findViewById<IndicatorSeekBar>(R.id.custom_section_color)

        sectionSeekBar.customSectionTrackColor(object : ColorCollector {
            override fun collectSectionTrackColor(colorIntArr: IntArray?): Boolean {
                //the length of colorIntArray equals section count
                colorIntArr!![0] = resources.getColor(R.color.color_blue, null)
                colorIntArr[1] = resources.getColor(R.color.color_gray, null)
                colorIntArr[2] = Color.parseColor("#FF4081")
                colorIntArr[3] = Color.parseColor("#303F9F")
                return true //true if apply color , otherwise no change
            }
        })

        //set listener
        val listenerSeekBar = root.findViewById<IndicatorSeekBar>(R.id.listener)
        val states = root.findViewById<TextView>(R.id.states)
        states.text = "states: "
        val progress = root.findViewById<TextView>(R.id.progress)
        progress.text = "progress: " + listenerSeekBar.progress
        val progress_float = root.findViewById<TextView>(R.id.progress_float)
        progress_float.text = "progress_float: " + listenerSeekBar.progressFloat
        val from_user = root.findViewById<TextView>(R.id.from_user)
        from_user.text = "from_user: "
        val thumb_position = root.findViewById<TextView>(R.id.thumb_position)
        thumb_position.text = "thumb_position: "
        val tick_text = root.findViewById<TextView>(R.id.tick_text)
        tick_text.text = "tick_text: "
        listenerSeekBar.onSeekChangeListener = object : OnSeekChangeListener {
            override fun onSeeking(seekParams: SeekParams?) {
                states.text = "states: onSeeking"
                progress.text = "progress: " + seekParams!!.progress
                progress_float.text = "progress_float: " + seekParams.progressFloat
                from_user.text = "from_user: " + seekParams.fromUser
                thumb_position.text = "thumb_position: " + seekParams.thumbPosition
                tick_text.text = "tick_text: " + seekParams.tickText
            }

            override fun onStartTrackingTouch(seekBar: IndicatorSeekBar?) {
                states.text = "states: onStart"
                progress.text = "progress: " + seekBar!!.progress
                progress_float.text = "progress_float: " + seekBar.progressFloat
                from_user.text = "from_user: true"
            }

            override fun onStopTrackingTouch(seekBar: IndicatorSeekBar?) {
                states.text = "states: onStop"
                progress.text = "progress: " + seekBar!!.progress
                progress_float.text = "progress_float: " + seekBar.progressFloat
                from_user.text = "from_user: false"
            }
        }
    }
}
