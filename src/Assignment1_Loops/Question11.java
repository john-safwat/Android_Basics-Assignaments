package Assignment1_Loops;

import java.util.Scanner;

// 11- Write java program to read an integer from user then print how many digit in
//this number
public class Question11 {

    // main function ( the entry point of the code )
    public static void main(String[] args) {

        // define the scanner object to read inputs from user
        Scanner scanner = new Scanner(System.in);
        // read input from user and store it in variable
        System.out.print("Enter Number : ");
        int number = scanner.nextInt();

        System.out.println("The Digits Number = "+ calcDigitsNumber(number));


    }

    // this function get the mod 10 of the number until it equal to 0 and count every digit
    public static int calcDigitsNumber(int number){

        int count = 0;
        while(number != 0){
            count++;
            number /= 10;
        }

        return count;
    }


}
