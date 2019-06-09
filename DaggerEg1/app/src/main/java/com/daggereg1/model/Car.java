package com.daggereg1.model;

import com.daggereg1.utils.LogHelper;

import javax.inject.Inject;

public class Car {

    private static final String CarTag = "car_tag";

    @Inject
    Engine engine;
    private Wheels wheels;


    @Inject
    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }


    @Inject
    public void enableRemote(Remote remote){
        remote.setListener(this);
    }

    public void drive(){
        engine.start();
        LogHelper.showLogData("drive the car...");
    }

}
