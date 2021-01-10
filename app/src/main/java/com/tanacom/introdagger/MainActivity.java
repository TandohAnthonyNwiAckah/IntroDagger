package com.tanacom.introdagger;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.tanacom.introdagger.interfaces.CarComponent;
import com.tanacom.introdagger.interfaces.DaggerCarComponent;
import com.tanacom.introdagger.models.Car;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

//    private Car car;

    @Inject Car car;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        initCar();

    }

    //    Initiate Car method
    private void initCar() {

        CarComponent carComponent = DaggerCarComponent.create();

//        car = carComponent.getCar();

        carComponent.inject(MainActivity.this);

        car.drive();

    }


}
