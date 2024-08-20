package com.warkiz.widget

import android.support.annotation.ColorInt

interface ColorCollector {
    fun collectSectionTrackColor(@ColorInt colorIntArr: IntArray?): Boolean
}