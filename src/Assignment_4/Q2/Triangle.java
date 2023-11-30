package Assignment_4.Q2;

public class Triangle extends Shape{

    // define the variables of the class
    protected int base;
    protected int height;

    // the default constructor to us give initial value to variables
    Triangle(){
        super();
        base = 0;
        height = 0;
    }

    // second constructor to set specific value to variables
    Triangle(String color , int base , int height){
        super(color);
        this.base = base<0?0:base;
        this.height = height<0?0:height;
    }

    // this implementation of getArea function will return the area of triangle
    @Override
    public double getArea() {
        return 0.5*base*height;
    }

    // to string function
    @Override
    public String toString() {
        return "Triangle Color :"+color+" | Base : "+base+" | Height : "+height;
    }
}
