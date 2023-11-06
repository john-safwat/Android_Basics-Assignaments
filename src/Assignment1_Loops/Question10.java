package Assignment1_Loops;

import java.util.Scanner;

// 10- Write java program to read integer from user then print sum of digit means add
//all the digits of any number for example if user enter 123 .output is 6 because 1 +2
//+3 = 6 an so on
public class Question10 {

    // main function ( the entry point of the code )
    public static void main(String[] args) {

        // define the scanner object to read inputs from user
        Scanner scanner = new Scanner(System.in);
        // read input from user and store it in variable
        System.out.print("Enter Number : ");
        int number = scanner.nextInt();

        System.out.println("The Digits Sum = "+ calcDigitsSum(number));


    }

    // this function get the mod 10 of the number until it equal to 0 and sum every digit
    public static int calcDigitsSum(int number){

        int sum = 0;
        while(number != 0){
            int digit = number%10;
            sum += digit;
            number /= 10;
        }

        return sum;
    }

}
