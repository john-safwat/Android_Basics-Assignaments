package Assignment1;

// 1. Write a Java program to get a number from the user and print whether it is positive or negative.
//Input number: 35
//Expected Output :
//Number is positive

import java.util.Scanner;

public class Question5 {


    // main function ( the entry point of the code )
    public static void main(String[] args) {

        // define the scanner object to read inputs from user
        Scanner scanner = new Scanner(System.in);

        // read input from user and store it in variable
        System.out.print("Enter Number : ");
        int number = scanner.nextInt();

        // validate on the number
        System.out.println(isPositive(number));

    }


    public static String isPositive(int number){

        if(number > 0)return  "Positive Number";
        else if (number< 0) return  "Negative Number";
        else  return "Zero";

    }


}
