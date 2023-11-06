package Assignment1;


import java.util.Scanner;

// 2-SortingThreeFloatingNumbers
//Write a program that reads in three Floating-point numbers and sort them. For Example
//2.5
//9
//4
//Use only conditional statement
//Output
//2.5
//4
//9
public class Question8 {


    // main function ( the entry point of the code )
    public static void main(String[] args) {

        // define the scanner object to read inputs from user
        Scanner scanner = new Scanner(System.in);

        // read input from user and store it in variable
        System.out.println("Enter Three Numbers ");
        System.out.print("Enter First Number : ");
        float num1 = scanner.nextFloat();
        System.out.print("Enter Second Number : ");
        float num2 = scanner.nextFloat();
        System.out.print("Enter Third Number : ");
        float num3 = scanner.nextFloat();


        // validate on the number
        sortNumbers(num1 , num2 ,num3);

    }


    // this function compare the first two number and swap them if the first number is greater than the second number
    // then it compare between the third number and the second number if the second is grater then it swap
    // at the last step it compare between the first and second value again to make sure that the first value is the smallest value
    public static void sortNumbers(float num1 , float num2 , float num3){

        if (num1 > num2) {
            float temp = num1;
            num1 = num2;
            num2 = temp;
        }

        if (num2 > num3) {
            float temp = num2;
            num2 = num3;
            num3 = temp;
        }

        if (num1 > num2) {
            float temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

    }


}
