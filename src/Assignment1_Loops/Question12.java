package Assignment1_Loops;

// 12- Given a number, print how many times can we divide it by 2?

import java.util.Scanner;

public class Question12 {

    // main function ( the entry point of the code )
    public static void main(String[] args) {

        // define the scanner object to read inputs from user
        Scanner scanner = new Scanner(System.in);
        // read input from user and store it in variable
        System.out.print("Enter Number : ");
        int number = scanner.nextInt();

        System.out.println("This Number Can Be Divided By Two "+ countDivisibleBy2Times(number) +" Times");


    }

    public static int countDivisibleBy2Times(int number){
        int count = 0;
        while (number != 0){
            count++;
            number/=2;
        }
        return  count;
    }

}
