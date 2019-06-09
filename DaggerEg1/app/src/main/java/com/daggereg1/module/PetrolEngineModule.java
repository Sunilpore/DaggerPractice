package com.daggereg1.module;

import com.daggereg1.model.Engine;
import com.daggereg1.model.PetrolEngine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class PetrolEngineModule {

/*    @Provides
    Engine provideEngine(PetrolEngine engine){
        return engine;
    }*/

    @Binds
    abstract Engine bindEngine(PetrolEngine engine);

}
