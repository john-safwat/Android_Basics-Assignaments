package Assignment1_Loops;

// 3- Repeat question 2 for an descending order

public class Question3 {


    // main function ( the entry point of the code )
    public static void main(String[] args) {
        printNumberFrom1To100Descending();
    }

    // loop on numbers and print numbers in descending
    public static void printNumberFrom1To100Descending(){
        for(int i = 100 ; i >= 1 ; i--){
            System.out.println(i);
        }
    }

}
