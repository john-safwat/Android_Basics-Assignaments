package Assignment1_Loops;

//6- program to display the following sequence of numbers: 7 14 21 28 35 42 49 56
//63 70 77 84 91 98

public class Question6 {

    // main function ( the entry point of the code )
    public static void main(String[] args) {
        printSequence();
    }

    public static void printSequence(){

        for(int i = 7 ; i<100 ;i+=7){
            System.out.println(i);
        }

    }


}
