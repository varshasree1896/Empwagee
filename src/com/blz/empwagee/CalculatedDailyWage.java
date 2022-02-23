package com.blz.empwagee;

public class CalculatedDailyWage {
        public static void main(String[] args) {
    //Use random function to check employee is present or absent
    // constants
    int EMP_WAGE_HOUR = 20;
    int FULL_DAY_HOURS = 8;
    // Variables
    int empHrs = 0;
    int empWage = 0;
    int empCheck = (int) (Math.floor(Math.random() * 10) % 2);
    if (empCheck == FULL_DAY_HOURS)
        empHrs = 8;
    else
        empHrs = 0;
    empWage = empHrs * empWage;
    System.out.println("Employee daily wage is " + empWage+ " " );
}
}
