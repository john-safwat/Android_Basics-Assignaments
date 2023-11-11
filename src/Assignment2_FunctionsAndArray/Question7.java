package Assignment2_FunctionsAndArray;

// 7- Modify the above function to be CountGeneral that takes array as
//parameter and count occurrences of every number in the array and print it
//Ex. Input [1,2,3,1,3,6] output
//1 -> 2
//2 -> 1
//3 -> 3
//6 -> 1

public class Question7 {


    // main function ( the entry point of the code )
    public static void main(String[] args) {

        // create object of class Utils to reuse the array reading function
        Utils utils = new Utils();
        countGeneral(utils.reedIntArray());

    }

    // this function assume that every element occurred once and check if this is true or not
    // this function create array with the same length as the passed array
    // loop on the passed array and count number of occurrence for each value and add the count to the counts array
    // the last step is to display the counts only once
    public static void countGeneral(int[] numbers){

        // Create an array to store the counts for each number
        int[] counts = new int[numbers.length];

        // Loop through each element in the input array
        for (int i = 0; i < numbers.length; i++) {

            int count = 0;
            // Count occurrences of the current number in the array
            for (int number : numbers) {
                if (numbers[i] == number) {
                    count++;
                }
            }
            // Store the count in the counts array
            counts[i] = count;
        }


        // Display the counts for each unique number in the input array
        for (int i = 0; i < numbers.length; i++) {

            boolean displayed = false ;

            // Check if the current number has already been displayed
            for(int j = i ; j >= 1 ; j--){
                if(numbers[i] == numbers[j-1]){
                    displayed = true;
                    break;
                }
            }

            // If the current number has not been displayed, print the count
            if(!displayed) System.out.println(numbers[i] + " -> " + counts[i]);
        }


    }

}
