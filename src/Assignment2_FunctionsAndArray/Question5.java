package Assignment2_FunctionsAndArray;

// 5- Wirte a function CalculateEven that takes array as parameter and calculate
// the sum of even numbers and how many even numbers

public class Question5 {

    // main function ( the entry point of the code )
    public static void main(String[] args) {

        // create object of class Utils to reuse the array reading function
        Utils utils = new Utils();
        System.out.println("The Sum of even numbers = "+ calculateEven(utils.reedIntArray()));

    }


    // function to calculate the even values of array
    // this function loop on array and if any value is divisible by 2 then add it to total
    public static int calculateEven(int[] numbers){

        int sum = 0;

        for(int number : numbers){
            if(number % 2 == 0) sum += number;
        }

        return  sum;

    }

}
