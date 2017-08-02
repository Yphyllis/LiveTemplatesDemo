package com.demo.lifecycle;

/**
 * Created by yanghe on 2017/8/2.
 * <p>
 * com.demo.lifecycle
 */

public class LiveTemplateCustom {

    private static LiveTemplateCustom mLiveTemplateCustom = null;

    private LiveTemplateCustom() {
    }

    public static LiveTemplateCustom getInstance() {
        synchronized (LiveTemplateCustom.class) {
            if (mLiveTemplateCustom == null) {
                mLiveTemplateCustom = new LiveTemplateCustom();
            }
        }
        return mLiveTemplateCustom;

    }
    // sin

}
