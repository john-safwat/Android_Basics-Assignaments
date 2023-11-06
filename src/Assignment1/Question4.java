package Assignment1;

// In this Program we are making a simple calculator that performs addition, subtraction, multiplication
//and division based on the user input. The program takes the value of both the numbers (entered by
//user) and then user is asked to enter the operation (+, -, * and /), based on the input program
//performs the selected operation on the entered numbers


import java.util.Scanner;

public class Question4 {


    public static void main(String[] args) {

        // define the scanner to take inputs from user
        Scanner scanner = new Scanner(System.in);

        // read numbers from user
        System.out.print("Enter First Number : ");
        double firstNumber = scanner.nextDouble();
        System.out.print("Enter Second Number : ");
        double secondNumber = scanner.nextDouble();

        // read operator
        System.out.println("Select Operatio Number ? \n 1- Add \n 2- Subtract \n 3- Multiplication \n 4- divide");
        System.out.print("Number : ");
        int operation = scanner.nextInt();

        // function to calculate
        calculate(firstNumber , secondNumber , operation);

    }


    public static void calculate(double firstNumber , double secondNumber , int operationsIndex){

        double res = 0;
        String error = "";


        // verify on data
        if(operationsIndex == 1) {
            res = firstNumber + secondNumber;
        }else if (operationsIndex == 2){
            res = firstNumber - secondNumber;
        }else if (operationsIndex == 3){
            res = firstNumber * secondNumber;
        }else if (operationsIndex == 4){
            res = firstNumber / secondNumber;
        }else {
            error = "Invalid Operation :(";
        }

        if (!error.isEmpty()) {
            System.out.println(error);
        }else {
            System.out.println("Result = "+res);
        }


    }

}
