package org.launchcode.java.demos.lsn5unittesting.test;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.demos.lsn5unittesting.main.Car;

import static org.junit.Assert.*;

public class CarTest {

    Car test_car;
    @Before
    public void createCarObject() {
        test_car = new Car("Toyota", "Prius", 10, 50);
    }

    //TODO: constructor sets gasTankLevel properly
    @Test
    public void testInitiatedGasTank() {
        assertEquals(10, test_car.getGasTankLevel(), .001);
    }

//    public void testInitiatedGasTank() {
//        assertFalse(test_car.getGasTankLevel() == 0);
//    }

//    public void testInitiatedGasTank() {
//        assertTrue(test_car.getGasTankLevel() == 10);
//    }

    //TODO: gasTankLevel is accurate after driving within tank range
    @Test
    public void testDrivingWithinRange() {
        test_car.drive(50);
        assertEquals(9, test_car.getGasTankLevel(), .001);
    }

    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    @Test
    public void testDrivingPastRange() {
        test_car.drive(550);
        assertEquals(0, test_car.getGasTankLevel(), .001);
    }

    //TODO: can't have more gas than tank size, expect an exception
    @Test(expected = IllegalArgumentException.class)
    public void testGasOverfillException() {
        test_car.addGas(5);
        fail("Shouldn't get here, car cannot have more gas in tank than the size of the tank");
    }
}
