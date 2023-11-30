package Assignment_4.Q1;

import java.util.ArrayList;

public class Teacher extends Person{

    // define the variables in class
    protected  int numCourses ;
    protected  ArrayList<String> courses;

    // the default constructor to us give initial value to variables
    Teacher(){
        super();
        numCourses = 0;
        courses = new ArrayList<String>();
    }

    // second constructor to set specific value to variables
    Teacher(String name , String address){super(name , address);}

    // this function add course if the passed course is not empty and return true
    public boolean addCourse(String course){
        if(course.isEmpty()){
            return false;
        }else {
            courses.add(course);
            return true;
        }
    }

    // this function remove course if the course exist in courses list
    public boolean removeCourse(String course){
        if(courses.contains(course)){
            System.out.println("This Course Doesn't Exist");
            return false;
        }
        return courses.remove(course);
    }

    @Override
    public String toString() {
        return "Teacher : "+name+"("+address+")";
    }
}
