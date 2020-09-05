package com.example.dependencyinjectionexample;


import dagger.Component;

@Component
public interface CarComponent {

    Car getCar();
}
