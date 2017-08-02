package com.demo.lifecycle;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 * Created by yanghe on 2017/8/2.
 * <p>
 * com.demo.lifecycle
 */
public class LiveTemplatesActivity extends Activity {

    private static final int C = 807; // const
    private static final String KEY_C = "C"; // key
    //  public static final;  --- psf
    //  public static final int   --- psfi
    //  public static final String      --- psfs
    //  String      --- St

    private LiveTemplatesActivity() {
        //no instance
    }

    ///////////////////////////////////////////////////////////////////////////
    // sbc
    ///////////////////////////////////////////////////////////////////////////

    ///////////////////////////////////////////////////////////////////////////
    // <code></code>      --- ccode
    // {@link }         --- clink
    // <code>false</code>   --- cfalse
    // <code>true</code>    --- ctrue
    ///////////////////////////////////////////////////////////////////////////

    /* no-op */    // noop

    // STOPSHIP: 2017/8/2   --- stopship

    // TODO: 2017/8/2       --- tode

    // FIXME: 2017/8/2      --- fixme

    public static void start(Context context) {
        Intent starter = new Intent(context, LiveTemplatesActivity.class);
        starter.putExtra(KEY_C, KEY_C);
        context.startActivity(starter);
    }   // starter

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.textview); //fbc

        textView.setVisibility(View.GONE);  //gone
        textView.setVisibility(View.VISIBLE);  //visible

        Intent view = new Intent();
        view.setAction(Intent.ACTION_VIEW);
        view.setData(Uri.parse(""));
        startActivity(view);        // IntentView

        getResources().getString(R.string.app_name); // rgS

        String.format("Test%s", KEY_C); // Sfmt

        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();  //Toast

    }

    private static final String TAG = "TAG";    // logt

    private void log() {
        Log.d(TAG, "log: ");        // logd
        Log.e(TAG, "log: ", new Throwable());   // loge
        Log.i(TAG, "log: ");    // logi
        Log.d(TAG, "log() called");     // logm
        Log.d(TAG, "log() returned: " + KEY_C);     // logr
        Log.w(TAG, "log: ", new Throwable());       // lgow
        Log.wtf(TAG, "log: ", new Throwable());     // wtf
    }

    private void iterat() {

        List<Integer> list = new ArrayList<>();
        int[] array = { 1, 1, 1, 1, };
        Iterator iterator = list.iterator();
        Vector vector = new Vector();

        for (int i = 0; i < list.size(); i++) {
            // fori
        }

        for (Integer i :
            list) {
            // foreach
        }

        for (Integer integer : list) {
            //  iter
        }

        while (iterator.hasNext()) {
            Object next = iterator.next();
            // itit
        }

        for (int i = 0; i < array.length; i++) {
            int ii = array[i];
            // itar
        }

        for (int i = array.length - 1; i >= 0; i--) {
            int i1 = array[i];
            // ritar
        }

        for (Iterator<Integer> integerIterator = list.iterator(); integerIterator.hasNext(); ) {
            Integer next = integerIterator.next();
            // itco
        }

        for (int i = 0; i < list.size(); i++) {
            Integer integer = list.get(i);
            // itli
        }

        for (int i = 0; i < vector.size(); i++) {
            Object o = vector.elementAt(i);
            // itve
        }

        vector.toArray(new Object[vector.size()]); // toar
    }

    private void sout() {

        String ss = "ss";

        System.err.println("");      // serr
        System.out.printf("");       // souf
        System.out.println("");       // sout
        System.out.println("LiveTemplatesActivity.sout");   // soutm
        System.out.println("");     // soutp
        System.out.println("ss = " + ss);   // soutv
    }

    public static LiveTemplatesActivity getInstance() {
        return null;
        // geti
    }

    public static void main(String[] args) {
        // psvm
    }

    private void other() {

        Object object = null;
        String ss = "";
        int i = 0;

        if (object == null) {
            // ifn
        }

        if (object != null) {
            // inn
        }

        if (ss instanceof CharSequence) {
            CharSequence aChar = (CharSequence) ss;
            // inst
        }

        if (ss == null) {
            ss = new String();
            // lazy
        }

        i = Math.min(i, 10);  // mn
        i = Math.max(i, 5);     //mx

        // throw new    --- thr
    }

    private LiveTemplatesEntity mLiveTemplatesEntity;
    //后缀关键型
    private boolean back() {

        List<Integer> list = new ArrayList<>();
        int[] array = { 1, 1, 1, 1, };

        String ss = "ss";  // "ss".var

        if (ss == null) {
            //  ss.null
        }

        if (ss != null) {
            //  ss.notnull
        }

        LiveTemplatesEntity liveTemplatesEntity = new LiveTemplatesEntity();    //  new LiveTemplatesEntiry().var

        mLiveTemplatesEntity = new LiveTemplatesEntity();       // new LiveTemplatesEntity().filed

        for (Integer integer : list) {
            // list.iter
        }

        for (int i = 0; i < list.size(); i++) {
            // list.fori
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            // list.forr
        }

        CharSequence ss1 = ((CharSequence) ss);     // ss.cast

        String.format(ss, ss);      // ss.format

        try {
            // ss.try
        } catch (Exception e) {
            e.printStackTrace();
        }

        switch (ss) {
            // ss.switch
        }

        return false;       // false.return
    }


    // 自定义
    private void custom() {

        String ss = "ss";
        int i = 0;

        switch (i) {
            case 0:

                break;
            default:

                break;
        }   // swit

        if (TextUtils.isEmpty(ss)) {
            // isn
        }

    }

    // click
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.textview:

                break;
            default:
                break;
        }
    }

}
