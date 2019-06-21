package com.daggereg1.component;

import com.daggereg1.model.Driver;
import com.daggereg1.module.DriverModule;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {/*DriverModule.class*/})
public interface AppComponent {


    /**It return activityComponent into subComponent and able to access whole dependencies graph of AppComponent
     *by removing below driver method
    */

    Driver getDriver();

}
