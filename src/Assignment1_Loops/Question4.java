package Assignment1_Loops;

// 4- You take two number from the user , base and power The output: Base ^ power

import java.util.Scanner;

public class Question4 {

    // main function ( the entry point of the code )
    public static void main(String[] args) {

        // define the scanner object to read inputs from user
        Scanner scanner = new Scanner(System.in);

        // read input from user and store it in variable
        System.out.print("Enter Base : ");
        int base = scanner.nextInt();
        System.out.print("Enter Power : ");
        int power = scanner.nextInt();


        // Calc The Power
        System.out.println(calcPower(base , power));

    }

    public static int calcPower(int base , int power){

        int res = 1;
        for(int i =0 ; i < power ; i++){
            res *= base;
        }

        return res;

    }

}
