package Assignment_4.Q2;

public class Rectangle extends Shape {

    // define the variables of the class
    protected int length;
    protected int width;

    // the default constructor to us give initial value to variables
    Rectangle(){
        super();
        length = 0;
        width = 0;
    }

    // second constructor to set specific value to variables
    Rectangle(String color , int length , int width){
        super(color);
        this.length = length<0?0:length;
        this.width = width<0?0:width;
    }

    // this implementation of getArea function will return the area of rectangle
    @Override
    public double getArea() {
        return width*length;
    }

    // to string function
    @Override
    public String toString() {
        return "Rectangle Color :"+color+" | Width : "+width+" | Length : "+length;
    }
}
