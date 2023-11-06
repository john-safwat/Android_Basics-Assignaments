package Assignment1;

// Input
//The first(and only)input line contains an integer number—the weight of the watermelon bought by the boys.
//Output
//PrintYES,if the boys can divide the water melon into two parts,each of them weigh ingeven number of kilos;and
//NO in the opposite case.
//Sampletest(s)
//input
//8
//output
//YES
//Note
//For Example,the boys can divide the watermelon into two parts of 2and 6 kilo s respectively (another variant—two
//parts of 4 and 4 kilos).

import java.util.Scanner;

public class Question7 {

    // main function ( the entry point of the code )
    public static void main(String[] args) {

        // define the scanner object to read inputs from user
        Scanner scanner = new Scanner(System.in);

        // read input from user and store it in variable
        System.out.print("Enter The Weight of The Watermelon : ");
        int watermelonWeight = scanner.nextInt();

        // validate on the number
        System.out.println(isDividable(watermelonWeight));

    }

    // if the weight of the watermelon is dividable by 2 then it will return yes else no
    public static String isDividable(int watermelonWeight){
        if (watermelonWeight % 2 == 0 && watermelonWeight > 2 )return "Yes";
        else return "No";
    }

}
