package com.tanacom.introdagger;

import android.util.Log;

import com.tanacom.introdagger.models.Engine;

import javax.inject.Inject;

public class DieselEngine implements Engine {

    private static final String TAG = "Car";

    @Inject
    public DieselEngine() {
    }

    @Override
    public void start() {
        Log.d(TAG, "start: Diesel Engine");
    }

}
