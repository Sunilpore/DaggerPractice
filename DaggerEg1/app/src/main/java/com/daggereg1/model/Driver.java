package com.daggereg1.model;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Driver {
    //we don't own this class so we can't annotate it with @Inject

    String name;

    public Driver(String name) {
        this.name = name;
    }

}
