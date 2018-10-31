package com.ewinddc.common;

import android.app.Application;
import android.content.Context;

/**
 * Created by ewinddc on 2018/7/25
 */
public class BaseApp extends Application {
    private static Context context = null;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
    }

    public static Context getContext(){
        return context;
    }
}
