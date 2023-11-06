package Assignment1_IfConditions;

// Write a java program that read a number of the month and print the month is in Summer, spring, winter or autumn.

import java.util.Scanner;

public class Question2 {


    // main function ( the entry point of the code )
    public static void main(String[] args) {

        // define the scanner object to read inputs from user
        Scanner scanner = new Scanner(System.in);

        // read input from user and store it in variable
        System.out.print("Enter Month Number : ");
        int monthNumber = scanner.nextInt();


        // validate on the number
        System.out.println(validateOnMonthSeason(monthNumber));

    }

    public static String validateOnMonthSeason(int monthNumber){

        // if the number is between 1 : 12 the function will return the Season name if not the function will return invalid month number message
        if(monthNumber == 12 ||  monthNumber == 1 || monthNumber == 2) return "Winter";
        else if(monthNumber == 3 || monthNumber == 4 || monthNumber == 5) return "Spring";
        else if(monthNumber == 6 || monthNumber == 7 || monthNumber == 8) return "Summer";
        else if(monthNumber == 9 || monthNumber == 10 || monthNumber == 11) return "Fail";
        else return "Invalid Month Number :(";

    }

}
