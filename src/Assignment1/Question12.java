package Assignment1;

import java.util.Scanner;

public class Question12 {

    // main function ( the entry point of the code )
    public static void main(String[] args) {

        // define the scanner object to read inputs from user
        Scanner scanner = new Scanner(System.in);

        // read input from user and store it in variable
        System.out.print("Enter Circle Radius : ");
        float radius = scanner.nextFloat();


        // calc the area
        System.out.println("The Area = " + findTheArea(radius));
    }

    public static double findTheArea(float radius){

        return  Math.PI * Math.pow(radius, 2);

    }


}
