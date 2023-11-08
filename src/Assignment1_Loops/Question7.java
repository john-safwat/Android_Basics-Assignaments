package Assignment1_Loops;

// 7- Program to display the following sequence of numbers: 1 2 4 8 16 32 64 128 256
//512

public class Question7 {

    // main function ( the entry point of the code )
    public static void main(String[] args) {
        printSequence();
    }

    public static void printSequence(){

        for(int i = 1 ; i<1000 ;i*=2){
            System.out.println(i);
        }

    }


}
