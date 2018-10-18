package com.ewinddc.common.aproxy;

import com.alibaba.android.arouter.facade.template.IProvider;

/**
 * Created by ewinddc on 2018/4/10.
 */

public interface IAManager extends IProvider {
     String getName();

     void setListener(IAListener listener);
}
