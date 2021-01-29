package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class DotProduct {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //initializes the arrays used
        double[] firstVector = new double[3];
        double[] secondVector = new double[3];
        double[] dotProduct = new double[3];
        double sum = 0.0;
        //the vector values are inserted into the arrays
        for (int i = 0; i < firstVector.length; i++){
            System.out.println("Enter the " + (i + 1) + "/3 value of the first vector: " );
            firstVector[i] = scan.nextDouble();
        }
        System.out.println();
        for (int j = 0; j < secondVector.length; j++){
            System.out.println("Enter the " + (j + 1) + "/3 value of the second vector: " );
            secondVector[j] = scan.nextDouble();
        }
        //the arrays are multiplied by each other
        for (int k = 0; k < dotProduct.length; k++ ){
            dotProduct[k] = firstVector[k] * secondVector[k];
        }
        //the values of the array are added together
        for (double j: dotProduct){
            sum += j;
        }

        System.out.println("Dot Product Vector: " + Arrays.toString(dotProduct) + "\nSum: " + sum);

    }
}
