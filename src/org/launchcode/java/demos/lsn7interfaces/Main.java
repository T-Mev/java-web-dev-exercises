package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.

//        System.out.println(flavors);
        flavors.sort(new FlavorComparator());
//        System.out.println("-----------\n" + flavors);

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.

//        System.out.println(cones);
        cones.sort(new ConeComparator());
//        System.out.println("-----------\n" + cones);

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.

        System.out.println("➤ Flavors in alphabetical order: ");
        for (Flavor flav : flavors){
            System.out.println(flav.getName());
        }

        System.out.println("-------------------\n➤ Cones in increasing order: ");
        for (Cone cone : cones){
            System.out.println(cone.getName() + ": $" + cone.getCost());
        }

//        Bonus #1
//        System.out.println(cones);
//        cones.sort(new ConeComparator());
//        System.out.println(cones);

    }
}
