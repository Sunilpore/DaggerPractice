package com.daggereg1.module;

import com.daggereg1.model.Driver;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class DriverModule {

    @Provides
    @Singleton
    static Driver provideDriver(){
        return new Driver();
    }


    //While using construction injection here, we have to provide @Singleton annotation inside Driver.class
    //which points below method to provide its instance
    //While using above static method we don't need to

    /*@Provides
    @Singleton
    Driver provideDriver(Driver driver){
        return driver;
    }*/

}
