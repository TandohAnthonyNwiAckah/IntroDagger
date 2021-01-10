package com.tanacom.introdagger.models;

import android.util.Log;

import javax.inject.Inject;

public class Car {

    // Constructor are injected first followed by field before method.

    private static final String TAG = "Car";

    //  Engine and Wheel are dependencies of cars. Hence Car depends on them.
//    @Inject

    private Engine engine;
    private Wheel wheel;

    // Constructor Injection is when a dependencies of a class is pass to its constructor.
//    @Inject
//    public Car(Wheel wheel) {
//        this.wheel = wheel;
//    }


    @Inject
    public Car(Engine engine, Wheel wheel) {
        this.engine = engine;
        this.wheel = wheel;
    }


    @Inject
    public void enableRemote(Remote remote) {
        remote.setListener(this);

    }

    public void drive() {
        Log.d(TAG, "driving");
    }


}
