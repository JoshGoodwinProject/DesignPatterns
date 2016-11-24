package com.joshgoodwinproject.test.prototypepattern;

import com.joshgoodwinproject.prototypepattern.Vehicle;
import com.joshgoodwinproject.prototypepattern.VehicleCache;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Josh on 11/19/2016.
 */
public class PrototypePatternTest {

    @Test
     public void prototypePatternTest(){

        VehicleCache.loadCache();

        Vehicle clonedVehicle = (Vehicle) VehicleCache.getVehicle("1");
        Assert.assertEquals(clonedVehicle.getType(), "Airplane");

        Vehicle clonedVehicle2 = (Vehicle) VehicleCache.getVehicle("2");
        Assert.assertEquals(clonedVehicle2.getType(), "Car");

        Vehicle clonedVehicle3 = (Vehicle) VehicleCache.getVehicle("3");
        Assert.assertEquals(clonedVehicle3.getType(), "Boat");
    }

}
