package Assignment_4;

public class Student extends  Person{

    // define the variables of the class
    private int numCourses ;
    private String[] courses;
    private int[] grades ;

    // the default constructor to us give initial value to variables
    Student(){
        super();
        numCourses = 0;
        courses = new String[]{};
        grades = new int[]{};
    }

    // second constructor to set specific value to variables
    Student(String name , String address , int numCourses , String[]courses , int[] grades){
        super(name , address);

    }

}
