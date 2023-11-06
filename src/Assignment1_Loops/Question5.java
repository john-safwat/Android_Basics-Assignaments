package Assignment1_Loops;

import java.util.Scanner;

// 5- You will take number from the user Write a java program to print its factorial.
public class Question5 {

    // main function ( the entry point of the code )
    public static void main(String[] args) {

        // define the scanner object to read inputs from user
        Scanner scanner = new Scanner(System.in);

        // read input from user and store it in variable
        System.out.print("Enter Number : ");
        int number = scanner.nextInt();


        // Calc The Power
        System.out.println("The Factorial = "+calcFactorial(number));

    }

    public static int calcFactorial(int number){

        int factorial = 1 ;
        for (int i = 2 ; i<= number ;i++){
            factorial *= i;
        }

        return  factorial;

    }

}
