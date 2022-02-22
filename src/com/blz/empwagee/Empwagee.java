package com.blz.empwagee;

public class Empwagee {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee wage");
        //Use random function to check employee is present or absent
        int empCheck = (int) (Math.floor(Math.random() * 10) % 2);
        if ( empCheck == 1 ) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }
}
