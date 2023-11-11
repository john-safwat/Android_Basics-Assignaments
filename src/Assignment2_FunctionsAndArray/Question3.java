package Assignment2_FunctionsAndArray;

// 3- Write a function getMax that takes array as parameter and returns the max
// value in the array

public class Question3 {

    // main function ( the entry point of the code )
    public static void main(String[] args) {

        // create object of class Utils to reuse the array reading function
        Utils utils = new Utils();
        System.out.println("The Max Value in This Array = "+ getMax(utils.reedIntArray()));

    }


    // this function for getting the max value
    // this method assume that the first value of the array is the max value and then Proof by contradiction if any value appear that
    // is greater than the first value then this value is the max value
    public static int getMax(int[] numbers){

        // assume that the first number is the max value
        int maxValue = numbers[0];

        // loop to check is this is true or false
        for(int number : numbers){
            if(number > maxValue) maxValue = number ;
        }

        return  maxValue;

    }

}
