package com.demo.lifecycle;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

/**
 * Created by yanghe on 2017/8/2.
 * <p>
 * com.demo.lifecycle
 */

public class LiveTemplatesFragment extends Fragment {

    public static LiveTemplatesFragment newInstance() {

        Bundle args = new Bundle();

        LiveTemplatesFragment fragment = new LiveTemplatesFragment();
        fragment.setArguments(args);
        return fragment;
    }   // newInstance

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                // rouiT
            }
        });


    }
}
