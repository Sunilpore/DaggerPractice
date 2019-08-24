package com.daggereg1;

import android.app.Application;

import com.daggereg1.component.ActivityComponents;
import com.daggereg1.component.AppComponent;
import com.daggereg1.component.DaggerAppComponent;

public class ExampleApp extends Application {

    //private ActivityComponents carComponents;
    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        //If Component class don't have any state or module then use .create() or else use .build()
        component = DaggerAppComponent.create();
    }


    public AppComponent getAppComponent(){
        return component;
    }

}
