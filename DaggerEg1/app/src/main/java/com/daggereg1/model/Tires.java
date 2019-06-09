package com.daggereg1.model;

import com.daggereg1.utils.LogHelper;

import javax.inject.Inject;


public class Tires {

    @Inject
    public Tires() {}

    public void inflate(){
        LogHelper.showLogData("Tires are inflated");
    }

}
