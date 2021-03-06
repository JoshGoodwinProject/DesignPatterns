package com.joshgoodwinproject.test.factorypattern;

import com.joshgoodwinproject.factorypattern.Vehicle;
import com.joshgoodwinproject.factorypattern.VehicleFactory;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Josh on 10/8/2016.
 */
public class FactoryPatternTest {


    @Test
    public void factoryPatternTest(){

        String vehicleMove;

        VehicleFactory vf = new VehicleFactory();
        Vehicle nullVehicle = vf.getVehicle("");
        Assert.assertNull(nullVehicle);

        Vehicle boat = vf.getVehicle("Boat");
        vehicleMove = boat.move();
        Assert.assertTrue(vehicleMove.equals( "Speeding on the water . . ."));

        Vehicle car = vf.getVehicle("Car");
        vehicleMove = car.move();
        Assert.assertTrue(vehicleMove.equals( "Driving away . . ."));

        Vehicle airplane = vf.getVehicle("Airplane");
        vehicleMove = airplane.move();
        Assert.assertTrue(vehicleMove.equals("Flying away . . ."));

    }
}
