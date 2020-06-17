package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double radius = null;
        System.out.println("Enter the radius of the circle:");

        if (input.hasNextDouble()){
            radius = input.nextDouble();
        } else {
            System.out.println("ERROR: Not a valid entry.");
            return;
        }

        while (radius <= 0) {
            System.out.println("Enter a number greater than 0:");
            if (input.hasNextDouble()){
                radius = input.nextDouble();
            } else {
                System.out.println("ERROR: Not a valid entry.");
                return;
            }
        }
        input.close();
        System.out.println("The area of the circle is: " + Circle.getArea(radius));
    }
}
