package com.bridgelabz;

import com.sun.corba.se.spi.activation._ActivatorImplBase;

public class EmployeeWageComputation {
    public static void main(String[] args)
    {
        getWelcomeMsg();

        Employee e1 = new Employee();
        e1.checkEmployee();
    }
    public static void getWelcomeMsg()
    {
        System.out.println("Welcome to EmployeeWage Computation...");
    }
}
class Employee
{
    final int FULL_TIME = 1;
    final int WAGE_PER_HOUR=20;
    public void checkEmployee() {
        int empType =  (int) (Math.random() * 100) % 2;
        if (empType == FULL_TIME) {
            System.out.println("Employee is Present");
            calculateWage();


        }
        else {
            System.out.println("Employee is absent");
        }
    }
    public void calculateWage(){
        int fullDayHour = 8;
        int wage = fullDayHour * WAGE_PER_HOUR;
        System.out.println("Employee Daily wage is "+wage);
    }
}
