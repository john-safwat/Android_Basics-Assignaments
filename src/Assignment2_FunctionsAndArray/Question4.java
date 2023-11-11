package Assignment2_FunctionsAndArray;

// 4- Write a function getMin that takes array as parameter and returns the min
//value in the array

public class Question4 {

    // main function ( the entry point of the code )
    public static void main(String[] args) {

        // create object of class Utils to reuse the array reading function
        Utils utils = new Utils();
        System.out.println("The Min Value in This Array = "+ getMin(utils.reedIntArray()));

    }


    // this function for getting the minimum value
    // this method assume that the first value of the array is the minimum value and then Proof by contradiction if any value appear that
    // is smaller than the first value then this value is the minimum value
    public static int getMin(int[] numbers){

        // assume that the first number is the max value
        int minValue = numbers[0];

        // loop to check is this is true or false
        for(int number : numbers){
            if(number < minValue) minValue = number ;
        }

        return  minValue;

    }

}
