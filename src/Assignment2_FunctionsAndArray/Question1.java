package Assignment2_FunctionsAndArray;

//1- Write a function getSummition that takes array as parameter and returns
//summation of its elements

public class Question1 {

    // main function ( the entry point of the code )
    public static void main(String[] args) {

        // create object of class Utils to reuse the array reading function
        Utils utils = new Utils();
        System.out.println("The Sum Of Array = "+ getIntArraySum(utils.reedIntArray()));
        System.out.println("The Sum Of Array = "+ getDoubleArraySum(utils.reedDoubleArray()));

    }

    // function to get array sum
    // this function loop on the array values and each number to the total and return the sum of this number
    public static int getIntArraySum(int[] numbers){

        int sum = 0 ;
        for (int number : numbers) {
            sum += number;
        }
        return  sum;

    }

    // this is the same function as the last function but work with the doubles
    public static double getDoubleArraySum(double[] numbers){

        double sum = 0 ;
        for (double number : numbers) {
            sum += number;
        }
        return  sum;

    }

}
