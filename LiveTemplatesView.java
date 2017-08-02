package com.demo.lifecycle;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by yanghe on 2017/8/2.
 * <p>
 * com.demo.lifecycle
 */

public class LiveTemplatesView extends View {

    public LiveTemplatesView(Context context) {
        this(context, null);
    }

    public LiveTemplatesView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public LiveTemplatesView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

    }   // ViewConstructors

    public static LiveTemplatesView getInstance() {
        return null;
        // geti
    }

}
