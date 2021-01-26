package com.company;
import java.text.DecimalFormat;
import java.util.Scanner;

public class UnitVectorMagnitude {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Initializes arrays to hold two points
        float a[];
        float b[];
        a = new float [3];
        b = new float [3];

        //takes user inputted values and stores them into two arrays
        for(int i = 0; i < a.length; i++) {
            System.out.println("Enter the values of the first point. " + (i + 1) + "/3: ");
            a[i] = scan.nextFloat();
        }
        for(int j = 0; j < b.length; j++) {
            System.out.println("Enter the values of the first point. " + (j + 1) + "/3: ");
            b[j] = scan.nextFloat();
        }

        //calculates the unit vector magnitude using the points a and b
        float unitVector = (float) Math.sqrt((Math.pow((a[0] - b[0]),2)) + (Math.pow((a[1] - b[1]),2)) + (Math.pow((a[2] - b[2]),2)));

        //Creates a decimal format that limits answer to only 4 decimal places
        DecimalFormat fmt = new DecimalFormat("##.####");
        System.out.println("Unit Vector Magnitude: " + fmt.format(unitVector));

    }
}
