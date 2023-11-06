package Assignment1_Loops;

public class Question8 {

    // main function ( the entry point of the code )
    public static void main(String[] args) {
        System.out.println("The Product = "+ calcOddIntegerProduct());;
    }

    public static int calcOddIntegerProduct(){

        int product = 1;
        for(int i = 1 ; i<16 ;i+=2){
            product*=i;
        }
        return product;

    }

}
