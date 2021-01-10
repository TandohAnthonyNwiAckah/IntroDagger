package com.tanacom.introdagger.models;

import android.util.Log;

import javax.inject.Inject;

public class Car {

    private static final String TAG = "Car";

    //  Engine and Wheel are dependencies of cars. Hence Car depends on them.
    private Engine engine;
    private Wheel wheel;

    // Constructor Injection is when a dependencies of a class is pass to its constructor.
    @Inject
    public Car(Engine engine, Wheel wheel) {
        this.engine = engine;
        this.wheel = wheel;
    }

    public void drive() {
        Log.d(TAG, "driving");

    }

}
