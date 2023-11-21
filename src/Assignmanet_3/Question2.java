package Assignmanet_3;

import java.util.Objects;

public class Question2 {

    public static void main(String[] args) {
        // Creating a Holiday instance for Independence Day
        Holiday octoberVictory = new Holiday("October Victory", 6, "October");

        // Example array of Holiday instances
        Holiday[] holidayArray = {
                new Holiday("New Year", 1, "January"),
                new Holiday("Christmas", 25, "December"),
                new Holiday("Thanksgiving", 26, "November")
        };

        System.out.println("The Average days = "+Holiday.avgDate(holidayArray));
    }

}


class Holiday {

    // define the variables
    private final String name;
    private final int day;
    private final String month;

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
    // this function take value of type holiday and validate in the month of this object and the month in passed holiday
    public Boolean isSameMonth(Holiday holiday) {
        return Objects.equals(this.month, holiday.month);
    }

    // function to calculate the average day in an array of Holiday instances
    // this function take array if holiday and loop on this array and sum all days values
    public static double avgDate(Holiday[] holidays) {
        int daysSum = 0;
        for (Holiday holiday : holidays) {
            daysSum += holiday.day;
        }
        return (double) daysSum / holidays.length;
    }

}