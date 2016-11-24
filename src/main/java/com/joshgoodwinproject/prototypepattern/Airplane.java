package com.joshgoodwinproject.prototypepattern;

/**
 * Created by Josh on 11/19/2016.
 */
public class Airplane extends Vehicle {

    public Airplane(){
        type = "Airplane";
    }
    public String move(){
        return "Fly";
    }
}
