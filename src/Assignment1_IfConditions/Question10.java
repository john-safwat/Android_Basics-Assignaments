package Assignment1_IfConditions;

//3.write a program to calculate the sum of positive integers and sum of negative integers for 6 integers.
//Example:
//Input:
//21 , -4 , 14 , -3
//Output:
//Sum of positive integers7
//Sumif Negative Integers-7

import java.util.Scanner;

public class Question10 {

    // main function ( the entry point of the code )
    public static void main(String[] args) {

        // define the scanner object to read inputs from user
        Scanner scanner = new Scanner(System.in);

        // read input from user and store it in variable
        System.out.println("Enter 6 Numbers ");
        System.out.print("Enter Number 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter Number 2: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter Number 3: ");
        int num3 = scanner.nextInt();
        System.out.print("Enter Number 4: ");
        int num4 = scanner.nextInt();
        System.out.print("Enter Number 5: ");
        int num5 = scanner.nextInt();
        System.out.print("Enter Number 6: ");
        int num6 = scanner.nextInt();


        // calc the positive numbers
        System.out.println("Sum of positive integers : "+ calcPositiveNumber(num1 , num2 ,num3 , num4 ,num5 ,num6));
        System.out.println("Sum of Negative integers : "+ calcNegativeNumber(num1 , num2 ,num3 , num4 ,num5 ,num6));


    }


    // function to calc the sum of the positive values
    public static int calcPositiveNumber(int num1 , int num2 , int num3 , int num4 , int num5 , int num6){

        int sum = 0;
        if(num1 >= 0 ) sum+= num1;
        if(num2 >= 0 ) sum+= num2;
        if(num3 >= 0 ) sum+= num3;
        if(num4 >= 0 ) sum+= num4;
        if(num5 >= 0 ) sum+= num5;
        if(num6 >= 0 ) sum+= num6;

        return  sum;
    }

    // function to calc the sum of the Negative values
    public static int calcNegativeNumber(int num1 , int num2 , int num3 , int num4 , int num5 , int num6){

        int sum = 0;
        if(num1 <= 0 ) sum+= num1;
        if(num2 <= 0 ) sum+= num2;
        if(num3 <= 0 ) sum+= num3;
        if(num4 <= 0 ) sum+= num4;
        if(num5 <= 0 ) sum+= num5;
        if(num6 <= 0 ) sum+= num6;

        return  sum;
    }

}
