package Assignment_4;

public class Person {

    // define the variables in class
    protected String name ;
    protected String address;

    // the default constructor to us give initial value to variables
    Person(){
        name = "UnKnow";
        address = "UnKnow" ;
    }

    // second constructor to set specific value to variables
    Person(String name , String address) {
        // validate if the passed values is not empty strings
        this.name = name.isEmpty()?"UnKnown":name ;
        this.address = address.isEmpty()?"UnKnown":address ;
    }

    // function get name to get name value
    public String getName(){return  name;}

    // function get address to get the address value
    public String getAddress(){return  address;}

    // function to set the address value with the given value
    public void setAddress(String address) {this.address = address.isEmpty()?"UnKnown" : address ;}

    @Override
    public String toString() {
        return name+"("+address+")";
    }
}
