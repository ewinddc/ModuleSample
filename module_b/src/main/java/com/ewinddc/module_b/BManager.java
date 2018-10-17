package com.ewinddc.module_b;

import javax.inject.Inject;

public class BManager {
    @Inject
    public BManager(){}
    public String getString(){
        return BManager.class.getSimpleName();
    }
}
