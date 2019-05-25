package com.kyun.android.kyun_business.application;

import android.app.Application;

public class MyApplication extends Application {

    public static  MyApplication mInstance = null;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
    }

    public MyApplication getInstance() {
        return mInstance;
    }
 }
