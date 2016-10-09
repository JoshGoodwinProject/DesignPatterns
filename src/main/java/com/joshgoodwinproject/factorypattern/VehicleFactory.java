package com.joshgoodwinproject.factorypattern;

/**
 * Created by Josh on 10/8/2016.
 */
public class VehicleFactory {

    public Vehicle getVehicle(String vehicleType){

        if(vehicleType == null){
            return null;
        }
        if(vehicleType.equals("Boat")){
            return new Boat();
        } else if(vehicleType.equals("Car")){
            return new Car();
        } else if(vehicleType.equals("Airplane")){
            return new Airplane();
        }

        return null;
    }
}
