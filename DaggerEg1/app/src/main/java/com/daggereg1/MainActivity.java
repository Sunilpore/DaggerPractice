package com.daggereg1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.daggereg1.component.CarComponents;
import com.daggereg1.component.DaggerCarComponents;
import com.daggereg1.model.Car;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponents carComponents = DaggerCarComponents.create();
        //CarComponents carComponents = null;
        carComponents.inject(this);

        car.drive();

    }


}
