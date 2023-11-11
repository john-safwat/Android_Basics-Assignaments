package Assignment2_FunctionsAndArray;

import java.util.Scanner;

public class Utils {

    // function to read array from user
    public int[] reedIntArray(){

        // define the scanner object to read inputs from user
        Scanner scanner = new Scanner(System.in);

        // read the length of the array
        System.out.print("Enter Array Length : ");
        int length = scanner.nextInt();

        // define the array to read data in
        int[] array = new int[length];

        // loop to read the array of numbers from user
        for(int i = 0 ; i < length ; i++){
            System.out.print("Enter Number : ");
            array[i] = scanner.nextInt();
        }

        return array;

    }

    // function to read array of double
    public double[] reedDoubleArray(){

        // define the scanner object to read inputs from user
        Scanner scanner = new Scanner(System.in);

        // read the length of the array
        System.out.print("Enter Array Length : ");
        int length = scanner.nextInt();

        // define the array to read data in
        double[] array = new double[length];

        // loop to read the array of numbers from user
        for(int i = 0 ; i < length ; i++){
            System.out.print("Enter Number : ");
            array[i] = scanner.nextDouble();
        }

        return array;

    }




}
