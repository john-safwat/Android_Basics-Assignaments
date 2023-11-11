package Assignment2_FunctionsAndArray;

// 8-Write function binary search that takes array and sorts it hint -> search about
// binary search

// 9 - search about selection sort and implement it in function SelectionSort that
// takes array as a parameter and sort it using the algorithm

import java.util.Scanner;

public class Question8_9 {

    // main function ( the entry point of the code )
    public static void main(String[] args) {
        // define the scanner object to read inputs from user
        Scanner scanner = new Scanner(System.in);

        // create object of class Utils to reuse the array reading function
        Utils utils = new Utils();

        // read numbers array
        int[] numbers = utils.reedIntArray();

        System.out.print("Enter Search Value : ");
        int value = scanner.nextInt();

        int result = binarySearch(selectionSort(numbers) , value);

        if(result == -1) System.out.println("The Value Not Found");
        else System.out.println("The Value is at index " + result);

    }


    // binary search function
    public static int binarySearch(int[] numbers, int value) {
        int left = 0;
        int right = numbers.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (numbers[mid] == value) {
                return mid;
            } else if (numbers[mid] < value) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }


    // selection sort function
    public static int[] selectionSort(int[] numbers) {

        for (int i = 0; i < numbers.length - 1; i++) {
            // Find the index of the minimum element in the unsorted part of the array
            int minIndex = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = numbers[minIndex];
            numbers[minIndex] = numbers[i];
            numbers[i] = temp;
        }

        return numbers;
    }


}
