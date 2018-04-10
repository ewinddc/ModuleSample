package com.ewinddc.module_a;

import com.ewinddc.common.aproxy.IAListener;
import com.ewinddc.common.aproxy.IAManager;

/**
 * Created by ewinddc on 2018/4/10.
 */

public class AManager implements IAManager {
    @Override
    public String getName() {
        return AManager.class.getName();
    }

    @Override
    public void setListener(IAListener listener) {

    }
}
