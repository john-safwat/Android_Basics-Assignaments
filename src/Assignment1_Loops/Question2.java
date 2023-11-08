package Assignment1_Loops;

//2- Your program print the numbers from one up to 100 in ascending order
public class Question2 {

    // main function ( the entry point of the code )
    public static void main(String[] args) {
        printNumberFrom1To100Ascending();
    }

    // loop on numbers and print numbers in ascending
    public static void printNumberFrom1To100Ascending(){
        for(int i = 1 ; i <= 100 ; i++){
            System.out.println(i);
        }
    }

}
