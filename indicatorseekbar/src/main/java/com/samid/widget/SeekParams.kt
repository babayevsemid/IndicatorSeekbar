package com.samid.widget

class SeekParams internal constructor(
    var seekBar: IndicatorSeekBar
) {
    
    var progress: Int = 0

    
    var progressFloat: Float = 0f

    
    var fromUser: Boolean = false

    
    var thumbPosition: Int = 0

    
    var tickText: String? = null
}
