package com.daggereg1.model;

import android.util.Log;

import com.daggereg1.utils.LogHelper;

import javax.inject.Inject;

public class DiselEngine implements Engine {


    private int horsePower;

    @Inject
    public DiselEngine(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public void start() {
        LogHelper.showLogData("Disel engine started. Horsepower: "+horsePower);
    }


}
