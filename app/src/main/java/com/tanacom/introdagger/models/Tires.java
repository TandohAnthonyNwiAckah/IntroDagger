package com.tanacom.introdagger.models;

import android.util.Log;

public class Tires {
    //We don't own this class so we can't annotate it with @Inject

    private static final String TAG = "Car";


    public void inflate() {
        Log.d(TAG, "Inflated Tires ...");
    }

}
