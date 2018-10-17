package com.ewinddc.module_b;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.ewinddc.common.RouteManager;
import com.ewinddc.common.aproxy.IAManager;

import javax.inject.Inject;

public class MainActivity extends Activity {
    private static final String TAG = MainActivity.class.getSimpleName();
    private IAManager manager;
    private TextView textView;
    @Inject BManager bManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.b_activity_main);
        textView = findViewById(R.id.text);
        manager = RouteManager.getInstance().getAManager();
        DaggerABComponent.builder().build().inject(this);
        if(textView != null){
            textView.setText(bManager.getString());
        }else {
            Log.d(TAG, "onCreate: textview null");
        }

    }
}
