package com.daggereg1.model;

import com.daggereg1.utils.LogHelper;

import javax.inject.Inject;

public class PetrolEngine implements Engine {

    @Inject
    public PetrolEngine() {
    }

    @Override
    public void start() {
        LogHelper.showLogData("Petrol engine started");
    }

}
