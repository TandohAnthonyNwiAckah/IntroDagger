package com.tanacom.introdagger.interfaces;


import com.tanacom.introdagger.MainActivity;
import com.tanacom.introdagger.module.WheelModule;

import dagger.Component;

@Component(modules = WheelModule.class)
public interface CarComponent {


//    Car getCar();

    void inject(MainActivity activity);

}
