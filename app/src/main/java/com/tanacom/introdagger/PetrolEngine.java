package com.tanacom.introdagger;

import android.util.Log;

import com.tanacom.introdagger.models.Engine;

import javax.inject.Inject;

public class PetrolEngine implements Engine {

    private static final String TAG = "Car";

    @Inject
    public PetrolEngine() {
    }

    @Override
    public void start() {
        Log.d(TAG, "start: Petrol Engine");
    }

}
