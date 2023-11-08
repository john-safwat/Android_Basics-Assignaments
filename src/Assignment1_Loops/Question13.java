package Assignment1_Loops;

//*13-Write a program that displays all the numbers from 100 to
//200, ten per line, that are divisible by 5 or 6, but not both.
//Numbers are separated by exactly one space
public class Question13 {

    // main function ( the entry point of the code )
    public static void main(String[] args) {
        printSequence();
    }

    // this function loop on numbers from 100 to 200 if number is divisible by 5 or 6 not both then add 1 to the count whenever the count is divisible
    // by 10 to print empty line
    public static void printSequence(){

        int count  = 0;
        for(int i = 100 ; i<=200 ;i++){
            if((i % 5 == 0 || i % 6 ==0) && !(i % 5 == 0 && i % 6 ==0)){
                System.out.print(i + " ");
                count ++;
            }
            if(count % 10 == 0 ){
                System.out.println();
            }
        }

    }

}
