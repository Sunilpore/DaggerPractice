package com.daggereg1.component;

import com.daggereg1.model.Driver;
import com.daggereg1.module.DriverModule;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {DriverModule.class})
public interface AppComponent {


    /**It return activityComponent into subComponent and able to access whole dependencies graph of AppComponent
     *by removing below driver method

     *Here we explicitly provide Driver instance. If we remove it then project not compile anymore,
     *  Becuase ActivityComponent will not get Driver instance when we use @Component in ActivityComponent
    */
    //Driver getDriver();

    /*
      Advantage->
      1. So here we don't required to expose Driver class explicitly
      2. If we wan't add another module in AppComponent then we don't need to explicitly expose them.
        Our ActivityComponent will automatically access all of them
     */

    ActivityComponents.Factory getActivityComponentFactory();
}
