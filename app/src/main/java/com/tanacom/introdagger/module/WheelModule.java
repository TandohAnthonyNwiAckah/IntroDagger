package com.tanacom.introdagger.module;


import com.tanacom.introdagger.models.Rims;
import com.tanacom.introdagger.models.Tires;
import com.tanacom.introdagger.models.Wheel;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelModule {

    @Provides
    static Rims provideRims() {
        return new Rims();
    }

    @Provides
    static Tires provideTires() {
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    static Wheel provideWheel(Rims rims, Tires tires) {

        return new Wheel(rims, tires);
    }


}
