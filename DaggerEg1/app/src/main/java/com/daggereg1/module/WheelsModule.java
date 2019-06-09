package com.daggereg1.module;


import com.daggereg1.model.Rims;
import com.daggereg1.model.Tires;
import com.daggereg1.model.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {

    //When @Provides methods don't depend on any instance state of the module then we can make this methods static which add better performance
    //Beacuse then dagger not need to instantiate this class and call this methods directly

    @Provides
    static Rims provideRims(){
       return new Rims();
    }

    @Provides
    static Tires provideTires(){
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    /**
     * Here daggers knows how to create all below objects which are our own classes, but come from external library
     * But we can't use inject annotation
     * In real apps instead of calling constructor we have to call builder method like retrofit builder
     * @param rims
     * @param tires
     * @return
     */
    @Provides
    static Wheels provideWheels(Rims rims, Tires tires){
        return new Wheels(rims,tires);
    }

}
