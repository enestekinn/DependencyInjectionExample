package com.example.dependencyinjectionexample;

import android.util.Log;

import java.util.logging.Logger;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";


    @Inject
    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    private Engine engine;
    private Wheels wheels;

    public void drive() {

        Log.e("Enes", "driving.....");
    }
}