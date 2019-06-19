package com.daggereg1.model;

import com.daggereg1.utils.LogHelper;

import javax.inject.Inject;
import javax.inject.Named;

public class PetrolEngine implements Engine {

    private int horsePower;
    private int engineCapacity;

    @Inject
    public PetrolEngine(@Named("horse power") int horsePower,
                        @Named("engine capacity") int engineCapacity) {
        this.horsePower = horsePower;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void start() {
        LogHelper.showLogData("Petrol engine started. " +
                "\nHorsePower: "+horsePower +
                "\n engine Capacity: "+engineCapacity);
    }

}
