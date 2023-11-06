package Assignment1_Loops;

// 9- Write a java program that read positive numbers from user Until read a negative
//number … then calculate and print The average of these numbers.

import java.util.Scanner;

public class Question9 {


    // main function ( the entry point of the code )
    public static void main(String[] args) {

        // define the scanner object to read inputs from user
        Scanner scanner = new Scanner(System.in);

        float sum = 0;
        float number = 0;
        float count = 0;

        while (true){
            // read input from user and store it in variable
            System.out.print("Enter Number : ");
            number = scanner.nextFloat();
            if (number >= 0){
                // find the sum of the numbers
                sum+=number;
                // count the numbers that user entered
                count ++;
            }else {
                break;
            }
        }

        System.out.println("The Average = "+(sum/count));


    }

}
