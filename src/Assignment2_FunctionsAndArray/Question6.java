package Assignment2_FunctionsAndArray;


// 6- Write a function count2 that takes array as parameter and counts
// occurrences of number 2
public class Question6 {

    // main function ( the entry point of the code )
    public static void main(String[] args) {

        // create object of class Utils to reuse the array reading function
        Utils utils = new Utils();
        System.out.println("The Count of Number 2 = "+ countTwo(utils.reedIntArray()));

    }

    // function to count the times of appearance of number 2
    // loop on the array and if the current value is 2 then increment the count by one
    public static int countTwo(int[] numbers){

        int count = 0;
        for (int number : numbers){
            if (number == 2) count++;
        }

        return  count;

    }

}
