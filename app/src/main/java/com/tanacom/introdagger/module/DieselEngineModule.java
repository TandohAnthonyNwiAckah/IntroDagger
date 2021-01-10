package com.tanacom.introdagger.module;


import com.tanacom.introdagger.DieselEngine;
import com.tanacom.introdagger.models.Engine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class DieselEngineModule {


    @Binds
    abstract Engine bindEngine(DieselEngine engine);


}

