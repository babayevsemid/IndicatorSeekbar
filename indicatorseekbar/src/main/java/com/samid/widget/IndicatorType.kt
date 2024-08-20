package com.samid.widget

interface IndicatorType {
    companion object {
        const val NONE: Int = 0
        const val CIRCULAR_BUBBLE: Int = 1
        const val ROUNDED_RECTANGLE: Int = 2
        const val RECTANGLE: Int = 3
        const val CUSTOM: Int = 4
    }
}