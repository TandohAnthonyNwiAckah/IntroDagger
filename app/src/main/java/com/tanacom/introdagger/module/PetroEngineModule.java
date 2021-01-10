package com.tanacom.introdagger.module;


import com.tanacom.introdagger.PetrolEngine;
import com.tanacom.introdagger.models.Engine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class PetroEngineModule {


//    @Provides
//    Engine provideEngine(PetrolEngine engine) {
//
//        return engine;
//    }

    @Binds
    abstract Engine bindEngine(PetrolEngine engine);


}

