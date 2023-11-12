import java.lang.Math;
public class DrewLine {

    public static void main(String[] args) {

        drewLine(20 , 10 , 30 , 18);

    }


    static void line(int x0 , int y0 , int x1 , int y1){

        float x , y ;

        float dy = y1 - y0;
        float dx = x1 - x0;
        float m = dy/dx;

        y = y0;

        for(x = x0 ; x<x1 ;x++){

            System.out.println("|| X = "+ x + " || "+"Y = "+ Math.round(y) +"  ||");
            y = y + m;

        }

    }


    static void drewLine(float x0 , float y0 , float x1 ,float y1){

        float dx = x1 - x0;
        float dy = y1 - y0;

        float p = 2 * dy - dx;
        float x = x0 , y = y0;

        for(int k = 0; k < dx ; k++){
            System.out.println("|| k = "+k+" || p = "+p+" || x = "+ x+" || y = "+y +" ||" );
            if (p < 0)
                p = p + (2*dy);
            else {
                p = p + 2*dy -2*dx;
                y++;
            }
            x++;
        }

    }

}
