package com.ewinddc.module_b;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.launcher.ARouter;
import com.ewinddc.common.aproxy.IAManager;

public class MainActivity extends Activity {
    private static final String TAG = MainActivity.class.getSimpleName();
    @Autowired(name = "/service/a")
    IAManager manager;
    private TextView textView;
    private TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.b_activity_main);
        ARouter.getInstance().inject(this);
        textView = findViewById(R.id.text);
        textView1 = findViewById(R.id.text1);
        if(textView != null){
            textView.setText(manager.getName());
        }else {
            Log.d(TAG, "onCreate: textview null");
        }

        manager = (IAManager) ARouter.getInstance().build("/service/aa").navigation();
        textView1.setText(manager.getName());

    }
}
