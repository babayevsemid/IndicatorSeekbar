package com.warkiz.indicatorseekbar.fragment

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.warkiz.indicatorseekbar.R

abstract class BaseFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(getLayoutId(), container, false)
        val textView = root.findViewById<TextView>(R.id.source_code)
        textView?.setOnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://github.com/warkiz/IndicatorSeekBar")
                )
            )
        }
        initView(root)
        return root
    }

    protected open fun getLayoutId():Int = 0

    protected open fun initView(root: View) {
    }
}
