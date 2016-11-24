package com.joshgoodwinproject.prototypepattern;

import java.util.HashMap;

/**
 * Created by Josh on 11/19/2016.
 */
public class VehicleCache {

    private static HashMap<String, Vehicle> vehicleMap = new HashMap<>();

    public static Vehicle getVehicle(String vehicleId){
        Vehicle cachedVehicle = vehicleMap.get(vehicleId);
        return (Vehicle) cachedVehicle.clone();
    }

    public static void loadCache() {
        Airplane airplane = new Airplane();
        airplane.setId("1");
        vehicleMap.put(airplane.getId(),airplane);

        Car car = new Car();
        car.setId("2");
        vehicleMap.put(car.getId(),car);

        Boat boat = new Boat();
        boat.setId("3");
        vehicleMap.put(boat.getId(), boat);
    }
}
