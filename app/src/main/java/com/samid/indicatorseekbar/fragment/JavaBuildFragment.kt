package com.samid.indicatorseekbar.fragment

import android.content.Context
import android.graphics.Color
import android.graphics.Typeface
import android.util.TypedValue
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import com.samid.indicatorseekbar.R
import com.samid.widget.IndicatorSeekBar.Companion.with
import com.samid.widget.IndicatorStayLayout
import com.samid.widget.IndicatorType
import com.samid.widget.TickMarkType

class JavaBuildFragment : BaseFragment() {
    override fun getLayoutId(): Int {
        return R.layout.java_build
    }

    override fun initView(root: View) {
        super.initView(root)
        val content = root.findViewById<View>(R.id.java_build) as LinearLayout

        val textView1 = textView
        textView1.text = "1. continuous"
        content.addView(textView1)
        //CONTINUOUS
        val continuous = with(context!!)
            .max(200f)
            .min(10f)
            .progress(33f)
            .indicatorColor(resources.getColor(R.color.color_blue, null))
            .indicatorTextColor(Color.parseColor("#ffffff"))
            .showIndicatorType(IndicatorType.CIRCULAR_BUBBLE)
            .thumbColorStateList(resources.getColorStateList(R.color.selector_thumb_color, null))
            .thumbSize(14)
            .trackProgressColor(resources.getColor(R.color.colorAccent, null))
            .trackProgressSize(4)
            .trackBackgroundColor(resources.getColor(R.color.color_gray, null))
            .trackBackgroundSize(2)
            .showThumbText(true)
            .thumbTextColor(resources.getColor(R.color.color_gray, null))
            .build()

        content.addView(continuous)

        val textView2 = textView
        textView2.text = "2. continuous_texts_ends"
        content.addView(textView2)
        //CONTINUOUS_TEXTS_ENDS
        val continuous2TickTexts = with(context!!)
            .max(100f)
            .min(10f)
            .progress(33f)
            .tickCount(2)
            .showTickMarksType(TickMarkType.NONE)
            .showTickTexts(true)
            .indicatorColor(resources.getColor(R.color.color_gray, null))
            .indicatorTextColor(Color.parseColor("#ffffff"))
            .showIndicatorType(IndicatorType.RECTANGLE)
            .thumbDrawable(resources.getDrawable(R.drawable.selector_thumb_drawable, null))
            .thumbSize(18)
            .trackProgressColor(resources.getColor(R.color.colorAccent, null))
            .trackProgressSize(4)
            .trackBackgroundColor(resources.getColor(R.color.color_gray, null))
            .trackBackgroundSize(2)
            .build()

        val continuousStayLayout = IndicatorStayLayout(context)
        continuousStayLayout.attachTo(continuous2TickTexts)
        content.addView(continuousStayLayout)

        val textView22 = textView
        textView22.text = "3. continuous_texts_ends_custom_ripple_thumb"
        content.addView(textView22)
        //CONTINUOUS_TEXTS_ENDS
        val continuous_texts_ends_custom_thumb = with(context!!)
            .max(100f)
            .min(30f)
            .progress(33f)
            .tickCount(2)
            .showTickMarksType(TickMarkType.NONE)
            .showTickTexts(true)
            .indicatorColor(resources.getColor(R.color.color_blue, null))
            .indicatorTextColor(Color.parseColor("#ffffff"))
            .showIndicatorType(IndicatorType.CIRCULAR_BUBBLE)
            .thumbDrawable(resources.getDrawable(R.drawable.selector_thumb_ripple_drawable, null))
            .thumbSize(26)
            .trackProgressColor(resources.getColor(R.color.colorAccent, null))
            .trackProgressSize(4)
            .trackBackgroundColor(resources.getColor(R.color.color_gray, null))
            .trackBackgroundSize(2)
            .build()
        content.addView(continuous_texts_ends_custom_thumb)

        val textView3 = textView
        textView3.text = "4. continuous_texts_ends_custom"
        content.addView(textView3)
        val continuous2TickTexts1 = with(context!!)
            .max(90f)
            .min(10f)
            .progress(33f)
            .tickCount(2)
            .showTickMarksType(TickMarkType.NONE)
            .showTickTexts(true)
            .tickTextsArray(R.array.last_next_length_2)
            .indicatorColor(resources.getColor(R.color.color_blue))
            .indicatorTextColor(Color.parseColor("#ffffff"))
            .showIndicatorType(IndicatorType.CIRCULAR_BUBBLE)
            .thumbColor(Color.parseColor("#ff0000"))
            .thumbSize(14)
            .trackProgressColor(resources.getColor(R.color.colorAccent, null))
            .trackProgressSize(4)
            .trackBackgroundColor(resources.getColor(R.color.color_gray, null))
            .trackBackgroundSize(2)
            .build()
        content.addView(continuous2TickTexts1)

        val textView4 = textView
        textView4.text = "5. discrete_ticks"
        content.addView(textView4)
        //DISCRETE_TICKS
        val discrete_ticks = with(context!!)
            .max(50f)
            .min(10f)
            .progress(33f)
            .tickCount(7)
            .tickMarksSize(15)
            .tickMarksDrawable(resources.getDrawable(R.drawable.selector_tick_marks_drawable, null))
            .indicatorColor(resources.getColor(R.color.color_blue))
            .indicatorTextColor(Color.parseColor("#ffffff"))
            .showIndicatorType(IndicatorType.ROUNDED_RECTANGLE)
            .thumbColor(Color.parseColor("#ff0000"))
            .thumbSize(14)
            .trackProgressColor(resources.getColor(R.color.colorAccent, null))
            .trackProgressSize(4)
            .trackBackgroundColor(resources.getColor(R.color.color_gray, null))
            .trackBackgroundSize(2)
            .build()
        val indicatorStayLayout = IndicatorStayLayout(context)
        indicatorStayLayout.attachTo(discrete_ticks)
        content.addView(indicatorStayLayout)

        val textView5 = textView
        textView5.text = "6. discrete_ticks_texts"
        content.addView(textView5)
        //DISCRETE_TICKS_TEXTS
        val discrete_ticks_texts = with(context!!)
            .max(110f)
            .min(10f)
            .progress(53f)
            .tickCount(7)
            .showTickMarksType(TickMarkType.OVAL)
            .tickMarksColor(resources.getColor(R.color.color_blue, null))
            .tickMarksSize(13) //dp
            .showTickTexts(true)
            .tickTextsColor(resources.getColor(R.color.color_pink, null))
            .tickTextsSize(13) //sp
            .tickTextsTypeFace(Typeface.MONOSPACE)
            .showIndicatorType(IndicatorType.ROUNDED_RECTANGLE)
            .indicatorColor(resources.getColor(R.color.color_blue, null))
            .indicatorTextColor(Color.parseColor("#ffffff"))
            .indicatorTextSize(13) //sp
            .thumbColor(resources.getColor(R.color.colorAccent, null))
            .thumbSize(14) //dp
            .trackProgressColor(resources.getColor(R.color.colorAccent, null))
            .trackProgressSize(4) //dp
            .trackBackgroundColor(resources.getColor(R.color.color_gray, null))
            .trackBackgroundSize(2) //dp
            .build()
        content.addView(discrete_ticks_texts)

        val textView6 = textView
        textView6.text = "7. discrete_ticks_texts_custom"
        content.addView(textView6)
        val array = arrayOf("A", "B", "C", "D", "E", "F", "G")
        val discrete_ticks_texts1 = with(context!!)
            .max(200f)
            .min(10f)
            .progress(83f)
            .tickCount(7)
            .showTickMarksType(TickMarkType.SQUARE)
            .tickTextsArray(array)
            .showTickTexts(true)
            .tickTextsColorStateList(
                resources.getColorStateList(
                    R.color.selector_tick_texts_3_color,
                    null
                )
            )
            .indicatorColor(resources.getColor(R.color.color_blue, null))
            .indicatorTextColor(Color.parseColor("#ffffff"))
            .showIndicatorType(IndicatorType.RECTANGLE)
            .thumbColor(Color.parseColor("#ff0000"))
            .thumbSize(14)
            .trackProgressColor(resources.getColor(R.color.colorAccent, null))
            .trackProgressSize(4)
            .trackBackgroundColor(resources.getColor(R.color.color_gray, null))
            .trackBackgroundSize(2)
            .build()
        content.addView(discrete_ticks_texts1)

        val textView7 = textView
        textView7.text = "8. discrete_ticks_texts_ends"
        content.addView(textView7)

        val array_ends = arrayOf("A", "", "", "", "", "", "G")
        val discrete_ticks_texts_ends = with(context!!)
            .max(100f)
            .min(10f)
            .progress(83f)
            .tickCount(7)
            .showTickMarksType(TickMarkType.OVAL)
            .tickMarksColor(resources.getColorStateList(R.color.selector_tick_marks_color, null))
            .tickTextsArray(array_ends)
            .showTickTexts(true)
            .showIndicatorType(IndicatorType.CIRCULAR_BUBBLE)
            .tickTextsColorStateList(
                resources.getColorStateList(
                    R.color.selector_tick_texts_3_color,
                    null
                )
            )
            .indicatorColor(resources.getColor(R.color.color_blue, null))
            .indicatorTextColor(Color.parseColor("#ffffff"))
            .thumbColor(Color.parseColor("#ff0000"))
            .thumbSize(14)
            .trackProgressColor(resources.getColor(R.color.color_blue, null))
            .trackProgressSize(4)
            .trackBackgroundColor(resources.getColor(R.color.color_pink, null))
            .trackBackgroundSize(2)
            .build()

        val stayLayout = IndicatorStayLayout(context)
        stayLayout.attachTo(discrete_ticks_texts_ends)
        content.addView(stayLayout)

        val textView8 = textView
        content.addView(textView8)
    }

    private val textView: TextView
        get() {
            val textView = TextView(context)
            val padding = dp2px(context, 16f)
            textView.setPadding(padding, padding, padding, 0)
            return textView
        }

    fun dp2px(context: Context?, dpValue: Float): Int {
        return TypedValue.applyDimension(
            TypedValue.COMPLEX_UNIT_DIP,
            dpValue,
            context!!.resources.displayMetrics
        ).toInt()
    }
}
