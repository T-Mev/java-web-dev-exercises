package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of miles driven:");
        float miles = input.nextFloat();

        System.out.println("Enter the amount of gas consumed (In gallons):");
        float gallons = input.nextFloat();
        input.close();

        float milesPerGallon = miles / gallons;
        System.out.println("Miles-per-gallon: " + milesPerGallon);
    }
}
