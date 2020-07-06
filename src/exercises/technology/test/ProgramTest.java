package exercises.technology.test;

import exercises.technology.Computer;
import exercises.technology.Laptop;
import exercises.technology.SmartPhone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProgramTest {

    Computer myComputer;
    Laptop myLaptop;
    SmartPhone myPhone;

    @Before
    public void createObjects() {
        myComputer = new Computer("HP",16, "AMD Ryzen 7 3700X", 1000);
        myLaptop = new Laptop("MSI",12, "Intel Core i7-4700MQ", 500, 12);
        myPhone = new SmartPhone("Samsung Galaxy", 8, "Snapdragon 855", 256,"T-Mobile");
    }
    //    Computer Tests
    @Test
    public void computerStartsPoweredOff(){
        assertEquals("Power: [OFF]", myComputer.hasPower());
    }

    @Test
    public void computerPowersOn(){
        assertTrue(myComputer.turnOn());
    }

    @Test
    public void computerPowersOff(){
        assertFalse(myComputer.turnOff());
    }

    @Test
    public void computerPrintsDocument(){
        assertEquals("'word.txt' has been sent to the printer.",myComputer.sendToPrinter("word.txt"));
    }

    //    Laptop Tests
    @Test
    public void laptopLidOpens(){
        assertFalse(myLaptop.openLid());
    }

    @Test
    public void laptopLidCloses(){
        assertTrue(myLaptop.closeLid());
    }

    @Test
    public void laptopCanMirrorScreen(){
        assertEquals("Connecting to TV...\n" +
                " ...\n" +
                " ...\n" +
                "Connection successful!",myLaptop.screenMirroring());
    }

    //    Smart Phone tests
    @Test
    public void isSmartPhoneDisplayOn() {
        assertEquals("Display: [OFF]", myPhone.isDisplayOn());
    }

    @Test
    public void smartPhoneCanMakeCalls() {
        assertEquals("Calling... Milhouse", myPhone.makeCall("Milhouse"));
    }

    @Test
    public void smartPhoneCanMakeASearch() {
        assertEquals("Searching for: 'Java Tutorials' Found: 200 results.", myPhone.smartSearch("Java Tutorials"));
    }

}
