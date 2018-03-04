package com.hettiger.blinkinglabel;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.support.v7.widget.AppCompatTextView;

/**
 * Created by martin on 04.03.18.
 */

public class BlinkingLabel extends AppCompatTextView {
    private Animation animation;

    public BlinkingLabel(Context context) {
        super(context);
        init();
    }

    public BlinkingLabel(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public BlinkingLabel(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public void startBlinking() {
        this.startAnimation(this.animation);
    }

    public void stopBlinking() {
        this.animation.cancel();
    }

    private void init() {
        this.animation = new AlphaAnimation(0.0f, 1.0f);
        this.animation.setDuration(50); //You can manage the blinking time with this parameter
        this.animation.setStartOffset(20);
        this.animation.setRepeatMode(Animation.REVERSE);
        this.animation.setRepeatCount(Animation.INFINITE);
    }
}