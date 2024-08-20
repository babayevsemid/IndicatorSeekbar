package com.samid.indicatorseekbar.fragment

import android.view.View
import android.widget.TextView
import com.samid.indicatorseekbar.R
import com.samid.widget.IndicatorSeekBar
import com.samid.widget.OnSeekChangeListener
import com.samid.widget.SeekParams

class CustomFragment : BaseFragment() {
    override fun getLayoutId(): Int {
        return R.layout.custom
    }

    override fun initView(root: View) {
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
                if (seekParams!!.fromUser) {
                    states.text = "states: onSeeking"
                } else {
                    states.text = "states: onStop"
                }
                progress.text = "progress: " + seekParams.progress
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
