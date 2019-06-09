package com.daggereg1.module;

import com.daggereg1.model.DiselEngine;
import com.daggereg1.model.Engine;
import com.daggereg1.model.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class DiselEngineModule {


    @Binds
    abstract Engine bindEngine(DiselEngine engine);

}
