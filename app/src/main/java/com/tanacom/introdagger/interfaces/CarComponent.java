package com.tanacom.introdagger.interfaces;


import com.tanacom.introdagger.models.Car;

import dagger.Component;

@Component
public interface CarComponent {


    Car getCar();


}