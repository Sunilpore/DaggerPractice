package com.daggereg1.model;

import com.daggereg1.module.PerActivity;
import com.daggereg1.utils.LogHelper;

import javax.inject.Inject;

@PerActivity
public class Car {

    private static final String CarTag = "car_tag";

    @Inject Driver driver;

    @Inject
    Engine engine;
    private Wheels wheels;


    @Inject
    public Car(Driver driver,Engine engine, Wheels wheels) {
        this.driver = driver;
        this.engine = engine;
        this.wheels = wheels;
    }


    @Inject
    public void enableRemote(Remote remote){
        remote.setListener(this);
    }

    public void drive(){
        engine.start();
        LogHelper.showLogData(driver +" "+driver.name+" drives "+this);
       // LogHelper.showLogData("drive the car...");
    }

}
