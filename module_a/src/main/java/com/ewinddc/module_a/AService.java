package com.ewinddc.module_a;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import com.ewinddc.common.RouteManager;


/**
 * Created by ewinddc on 2018/4/10.
 */

public class AService extends Service {
    private static final String TAG = AService.class.getSimpleName();
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate: ");
        RouteManager.getInstance().setAManager(new AManager());
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        super.onStartCommand(intent, flags, startId);
        Log.d(TAG, "onStartCommand: ");
        return START_STICKY;
    }
}
