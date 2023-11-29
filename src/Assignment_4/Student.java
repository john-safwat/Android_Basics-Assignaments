package Assignment_4;

import java.util.ArrayList;

public class Student extends  Person{

    // define the variables of the class
    private int numCourses ;
    private ArrayList<String> courses;
    private ArrayList<Integer> grades ;

    // the default constructor to us give initial value to variables
    Student(){
        super();
        numCourses = 0;
        courses = new ArrayList<String>();
        grades = new  ArrayList<Integer>();
    }

    // second constructor to set specific value to variables
    Student(String name , String address){
        super(name , address);
    }

    // function add course grades
    public void addCourseGrades(String course , int grade){

        // validate on input's data
        if(course.isEmpty() || grade < 0) {
            System.out.println("Invalid Inputs");
            return;
        }

        // add course to courses and grades
        courses.add(course);
        grades.add(grade);

    }

    // function to print all students
    public void printGrade(){
        // function to loop on all grades and print the course name and this course grade
        for(int i = 0; i<grades.toArray().length ; i++){
            System.out.println("Course : "+courses.get(i)+" With Grade : "+grades.get(i));
        }
    }

    // function to loop on grades and add it to sum then divide it on the average
    public  double getAverage(){
        int sum = 0;
        for(int i = 0; i< grades.toArray().length ; i++)sum+=grades.get(i);
        return  ((double)sum /grades.toArray().length);
    }

    @Override
    public String toString() {
        return "Student : "+name+"("+address+")";
    }
}
