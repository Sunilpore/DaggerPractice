package com.daggereg1.module;

import com.daggereg1.model.DiselEngine;
import com.daggereg1.model.Engine;
import com.daggereg1.model.PetrolEngine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class DiselEngineModule {

    /**
     * This will be useful many places. e.g. in many places you required context which is availaible once during runtime
     */
    private int horsePower;

    public DiselEngineModule(int horsePower){
        this.horsePower = horsePower;
    }

    @Provides
    int provideHorsePower(){
        return horsePower;
    }

    /*@Provides
    Engine provideEngine(){
        return new DiselEngine(horsePower);
    }*/


    @Provides
    Engine provideEngine(DiselEngine diselEngine){
        return diselEngine;
    }

    /*@Binds
    abstract Engine bindEngine(DiselEngine engine);*/

}
