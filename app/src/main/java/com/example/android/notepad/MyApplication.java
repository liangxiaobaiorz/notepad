package com.example.android.notepad;

import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by Y430P on 2017/5/9.
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/comic.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
    }

}