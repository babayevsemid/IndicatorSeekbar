package com.samid.widget

interface OnSeekChangeListener {
    fun onSeeking(seekParams: SeekParams?)
    fun onStartTrackingTouch(seekBar: IndicatorSeekBar?)
    fun onStopTrackingTouch(seekBar: IndicatorSeekBar?)
}