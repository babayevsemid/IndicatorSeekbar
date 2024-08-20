# IndicatorSeekbar  

### Installation

Add this to your ```build.gradle``` file

```
repositories {
    maven {
        url "https://jitpack.io"
    }
}

dependencies {
    implementation 'com.github.babayevsemid:indicatorseekbar:1.0.1' 
}

### Use

```
<com.samid.widget.IndicatorSeekBar
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                app:isb_progress="66"
                app:isb_show_indicator="rectangle"
                app:isb_show_tick_marks_type="divider"
                app:isb_show_tick_texts="true"
                app:isb_tick_marks_color="@color/color_blue"
                app:isb_tick_marks_ends_hide="true"
                app:isb_tick_texts_array="@array/small_normal_middle_large_length_7"
                app:isb_tick_texts_color="@color/color_blue"
                app:isb_ticks_count="7" />
```
