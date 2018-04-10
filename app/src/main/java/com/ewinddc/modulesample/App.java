package com.ewinddc.modulesample;

import android.app.Application;
import android.content.Intent;

import com.ewinddc.common.Constants;

/**
 * Created by ewinddc on 2018/4/10.
 */

public class App extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        Intent intent = new Intent();
        intent.setPackage(getPackageName());
        intent.setAction(Constants.A_ACTION);
        startService(intent);
    }
}
