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
    final int PART_TIME = 2;
    final int WAGE_PER_HOUR=20;
    public void checkEmployee() {
        int empType =  (int) (Math.random() * 100) % 3;
        if (empType == FULL_TIME) {
            System.out.println("Employee is Present with full time");
            fullCalculateWage();
        } else if (empType == PART_TIME) {
            System.out.println("Employee present with part time");
            partCalculateWage();
        } else {
            System.out.println("Employee is absent");
        }
    }
    public void fullCalculateWage(){
        int fullDayHour = 8;
        int wage = fullDayHour * WAGE_PER_HOUR;
        System.out.println("Employee full Daily wage is "+wage);
    }
    public void partCalculateWage(){
        int halfDayHour = 4;
        int wage = halfDayHour * WAGE_PER_HOUR;
        System.out.println("Employee half Daily wage is "+wage);
    }

}
