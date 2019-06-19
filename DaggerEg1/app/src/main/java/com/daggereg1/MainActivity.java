package com.daggereg1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.daggereg1.component.ActivityComponents;
import com.daggereg1.component.DaggerActivityComponents;
import com.daggereg1.component.DaggerAppComponent;
import com.daggereg1.model.Car;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car, car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * create method is prefer when we don't need to pass any argument via constructor
         * else use builder
         */
        /*ActivityComponents carComponents = DaggerCarComponents.builder()
                .diselEngineModule(new DiselEngineModule(100))
                .build();*/

        /*ActivityComponents carComponents = DaggerCarComponents.builder()
                .horsePower(150)
                .engineCapacity(1400)
                .build();*/

        //ActivityComponents carComponents = ((ExampleApp)getApplication()).getAppComponent();

        ActivityComponents components = DaggerActivityComponents.builder()
                                        .horsePower(200)
                                        .engineCapacity(1700)
                                        .appComponent(((ExampleApp) getApplication()).getAppComponent())
                                        .build();

        //ActivityComponents carComponents = null;
        components.inject(this);

        /**
         * So here car is scope to Activity level, while Driver is scope at application level
         * means there is new instance of car is created when activity is created
         * but Driver create single instance throughout the Application
         */


        car.drive();
        car2.drive();

    }


}
