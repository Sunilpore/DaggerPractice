package com.daggereg1.component;

import com.daggereg1.MainActivity;
import com.daggereg1.model.Car;
import com.daggereg1.module.DiselEngineModule;
import com.daggereg1.module.PerActivity;
import com.daggereg1.module.PetrolEngineModule;
import com.daggereg1.module.WheelsModule;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Subcomponent;


//Here we cannot put PetrolEngineModule and DiselEngineModule inside Component module
// else dagger will throw duplicate error

/**
 *@AppComponent Here AppComponent class provide Driver instance which create Single instance through out application
 * @SubComponent It can access all the objects of the Parent component.
 */

@PerActivity
@Subcomponent(/*dependencies = AppComponent.class,*/ modules ={WheelsModule.class, /*PetrolEngineModule.class,*/ DiselEngineModule.class})
public interface ActivityComponents {

    //So here we use @SubComponent instead of 'dependencies' of @Component
    // which is another approach to achieve dependency graph

    Car getCar();

    void inject(MainActivity mainActivity);



    /*@Component.Builder
    interface Builder {

        @BindsInstance
        Builder horsePower(@Named("horse power") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("engine capacity") int engineCapacity);

        Builder appComponent(AppComponent appComponent);

        ActivityComponents build();
    }*/

 }
