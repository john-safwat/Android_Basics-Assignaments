package Assignmanet_3;

import java.util.Objects;

public class Question2 {
}


class Holiday {

    // define the variables
    private String name;
    private int day;
    private String month;

    // the default constructor to give the initial values
    Holiday(){
        name = "None";
        day = 1;
        month = "none";
    }

    // the second constructor to validate and set the holiday values
    Holiday(String name , int day , String month ){
        this.name = !name.isEmpty() ? name : "None";
        this.day = day>0 && day<=31 ? day : 1;
        this.month = !month.isEmpty() ? month : "None";
    }


    // function inSameMonth to see if the holiday in the same month
    public Boolean isSameMonth(Holiday holiday) {
        return Objects.equals(this.month, holiday.month);
    }

}