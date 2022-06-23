package com.bridgelabz;

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
        switch (empType)
        {
            case FULL_TIME:
                System.out.println("Employee is Present Full time");
                fullCalculateWage();
                break;
            case PART_TIME:
                System.out.println("Employee is Present Part time");
                partCalculateWage();
                break;
            default:
                System.out.println("Employee is Absent");
        }
    }
    public void fullCalculateWage(){
        int fullDayHour = 8;
        int wage = fullDayHour * WAGE_PER_HOUR;
        System.out.println("Employee full Daily wage is "+wage);
        wagePerMonth(wage);
    }
    public void partCalculateWage(){
        int halfDayHour = 4;
        int wage = halfDayHour * WAGE_PER_HOUR;
        System.out.println("Employee half Daily wage is "+wage);
        wagePerMonth(wage);
    }
    public void wagePerMonth(int wage){
        int totalWorkingDays = 20;
        int wageForMonth = wage * totalWorkingDays;
        System.out.println("wage per month is "+wageForMonth);

    }

}
