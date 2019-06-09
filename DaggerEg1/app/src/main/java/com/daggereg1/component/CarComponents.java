package com.daggereg1.component;

import com.daggereg1.MainActivity;
import com.daggereg1.model.Car;
import com.daggereg1.module.DiselEngineModule;
import com.daggereg1.module.PetrolEngineModule;
import com.daggereg1.module.WheelsModule;

import dagger.Component;


//Here we cannot put PetrolEngineModule and DiselEngineModule inside Component module
// else dagger will throw duplicate error

@Component(modules ={WheelsModule.class, /* PetrolEngineModule.class,*/ DiselEngineModule.class})
public interface CarComponents {

    Car getCar();

    void inject(MainActivity mainActivity);

 }
