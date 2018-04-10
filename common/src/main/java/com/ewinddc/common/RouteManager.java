package com.ewinddc.common;

import android.util.Log;

import com.ewinddc.common.aproxy.IAManager;

/**
 * Created by ewinddc on 2018/4/10.
 */

public class RouteManager {
    private static final String TAG = RouteManager.class.getSimpleName();
    private RouteManager(){
    }
    private static RouteManager instance = null;
    public static RouteManager getInstance(){
        if(instance == null){
            instance = new RouteManager();
        }
        return instance;
    }

    IAManager aManager;
    public void setAManager(IAManager manager){
        Log.d(TAG, this+" setAManager: "+manager);
        aManager = manager;
    }
    public IAManager getAManager(){
        Log.d(TAG, this+" getAManager: ");
        return aManager;
    }
}
