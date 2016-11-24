package com.joshgoodwinproject.prototypepattern;

/**
 * Created by Josh on 11/19/2016.
 */
public class Car extends Vehicle {

    public Car(){
        type = "Car";
    }

    public String move(){
        return "Drive";
    }
}
