package Assignment2_FunctionsAndArray;

// 2- Write a function getNumOfElements that takes array as parameter and
//returns the number of its elements

public class Question2 {

    // main function ( the entry point of the code )
    public static void main(String[] args) {

        // create object of class Utils to reuse the array reading function
        Utils utils = new Utils();
        System.out.println("The Number of Elements in This Array = "+ getNumOfElements(utils.reedIntArray()));

    }

    // this function validate on the array is not empty and return the array length
    private static int getNumOfElements(int[] array) {

        if (array == null) {
            return 0; // Return 0 for null arrays and break the function
        }
        return array.length;
    }


}
