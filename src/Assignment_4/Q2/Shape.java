package Assignment_4.Q2;

public abstract class Shape {

    // define the variables of the class
    protected String color;

    // the default constructor to us give initial value to variables
    Shape(){
        color = "None";
    }

    // second constructor to set specific value to variables
    Shape(String color){
        this.color = color.isEmpty()?"None":color;
    }

    // abstract function to get area (this function implementation will be in the concrete class)
    public abstract double getArea();

    // to String function


    @Override
    public String toString() {
        return "Shape Color : "+color;
    }
}
