package Assignment1;

import java.util.Scanner;

public class Question11 {

    // main function ( the entry point of the code )
    public static void main(String[] args) {

        // define the scanner object to read inputs from user
        Scanner scanner = new Scanner(System.in);

        // read input from user and store it in variable
        System.out.println("Enter Three Numbers ");
        System.out.print("Input the 1st number: ");
        float num1 = scanner.nextFloat();
        System.out.print("Input the 2st number: ");
        float num2 = scanner.nextFloat();
        System.out.print("Input the 3st number: ");
        float num3 = scanner.nextFloat();


        // validate on the number
        System.out.println("The greatest : " + findGreatestNumber(num1 , num2 ,num3));
    }

    // This function assumes that the first number is the largest, and if a larger number is found, delete the value of the first number and replace it with the larger value.
    public static float findGreatestNumber(float num1 , float num2, float num3){

        if(num1 < num2) num1 = num2;
        if(num1 < num3) num1 = num3;

        return  num1;

    }

}
