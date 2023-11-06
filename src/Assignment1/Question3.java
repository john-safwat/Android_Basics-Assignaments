package Assignment1;

// The alphabets A, E, I, O and U (smallcase and uppercase) are known as Vowels and rest of the
//alphabets are known as consonants. Here we will write a java program that checks whether the
//input character is vowel or Consonant.

import java.util.Scanner;

public class Question3 {



    // main function ( the entry point of the doe )
    public static void main(String[] args) {

        // define the scanner object to read inputs from user
        Scanner scanner = new Scanner(System.in);

        // read input from user and store it in variable
        System.out.print("Enter Month Number : ");
        char character = scanner.next().charAt(0);


        // validate on the number
        System.out.println(isVowels(character));

    }

    private static String isVowels(char character) {

        // validate id the character is vowel or not
        if (character == 'a' || character == 'A' || character == 'e' || character == 'E' || character == 'i'
                || character == 'I' || character == 'o' || character == 'O' || character == 'u' || character == 'U')
            return  "Vowel";
        else
            return  "Consonant";

    }


}
