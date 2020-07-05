package org.launchcode.java.demos.lsn6inheritance;

public class Main {
    public static void main(String[] args) {

        HouseCat buddy = new HouseCat("Buddy", 9.0);

        System.out.println(buddy);
//        buddy.eat();
        System.out.println(buddy.isTired());
//        System.out.println(buddy.getWeight());

        Cat plainCat = new Cat(8.6);
        System.out.println(plainCat.noise());
        System.out.println(buddy.noise());

        System.out.println("////////////////");

        buddy.isSatisfied();
        System.out.println(buddy.noise());
    }
}
