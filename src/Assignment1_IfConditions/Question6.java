package Assignment1_IfConditions;

// Write a program which calculates marks on basis of given grades in java using switch statement
//if Grade A then marks >=80
//if Grade B then marks >=60 and less than 80
//if Grade C then marks >=40 and less than 60
//if Grade F then marks <=40
//if any other grade is passed then print invalid grade

import java.util.Scanner;

public class Question6 {

    // main function ( the entry point of the code )
    public static void main(String[] args) {

        // define the scanner object to read inputs from user
        Scanner scanner = new Scanner(System.in);

        // read input from user and store it in variable
        System.out.print("Enter Grade : ");
        int grade = scanner.nextInt();

        // validate on the number
        System.out.println(calcGrade(grade));

    }

    // function to check of grade > 80 then return A , if Grade B then marks >=60 and less than 80 , if Grade C then marks >=40 and less than 60 , if Grade F then marks <=40
    public static String calcGrade(int grade){

        if(grade >= 80) return "A";
        else if(grade >=60) return "B";
        else if(grade >=40) return "C";
        else if(grade >=0) return "F";
        else  return  "Invalid Grade";

    }

}
