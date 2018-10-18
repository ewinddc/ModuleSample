package com.ewinddc.module_a;

import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.ewinddc.common.aproxy.IAListener;
import com.ewinddc.common.aproxy.IAManager;

/**
 * Created by ewinddc on 2018/10/18
 */
@Route(path = "/service/aa")
public class AAManger implements IAManager {
    @Override
    public String getName() {
        return AAManger.class.getSimpleName();
    }

    @Override
    public void setListener(IAListener listener) {

    }

    @Override
    public void init(Context context) {

    }
}
