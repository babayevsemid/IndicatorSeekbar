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
        app:isb_max="-40"
        app:isb_min="-100"
        app:isb_progress="-70"
        app:isb_seek_smoothly="true"
        app:isb_show_indicator="rectangle"
        app:isb_show_tick_marks_type="square"
        app:isb_show_tick_texts="true"
        app:isb_thumb_adjust_auto="false"
        app:isb_tick_marks_color="@color/selector_tick_marks_color"
        app:isb_ticks_count="5"
        app:isb_track_progress_color="@color/color_blue"
        app:isb_track_progress_size="3dp" />
```
