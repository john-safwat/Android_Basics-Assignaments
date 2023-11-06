package Assignment1;

// Write a java program that read a number of the month And then print the name of it

import java.util.Scanner;

public class Question1 {


    // main function ( the entry point of the doe )
    public static void main(String[] args) {

        // define the scanner object to read inputs from user
        Scanner scanner = new Scanner(System.in);

        // read input from user and store it in variable
        System.out.print("Enter Month Number : ");
        int monthNumber = scanner.nextInt();


        // validate on the number
        System.out.println(validateOnMonth(monthNumber));

    }

    // function that take the number and return month name
    public static String validateOnMonth(int monthNumber){

        // if the number is between 1 : 12 the function will return the month name if not the function will return invalid month number message
        if(monthNumber == 1) return "January";
        else if(monthNumber == 2) return "February";
        else if(monthNumber == 3) return "March";
        else if(monthNumber == 4) return "April";
        else if(monthNumber == 5) return "May";
        else if(monthNumber == 6) return "June";
        else if(monthNumber == 7) return "July";
        else if(monthNumber == 8) return "August";
        else if(monthNumber == 9) return "September";
        else if(monthNumber == 10) return "October";
        else if(monthNumber == 11) return "November";
        else if(monthNumber == 12) return "December";
        else return "Invalid Month Number :(";

    }


}
