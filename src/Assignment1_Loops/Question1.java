package Assignment1_Loops;

// 1- A program to print numbers divisible by 5, for the integers from 1 to 99.
public class Question1 {

    // main function ( the entry point of the code )
    public static void main(String[] args) {
        printDivisibleBy5();
    }

    // loop on numbers if number % 5 is equal to 0 then it divisible by 5
    public static void printDivisibleBy5(){
        for(int i = 1 ; i < 100 ; i++){
            if (i % 5 == 0) System.out.println(i);
        }
    }
}
