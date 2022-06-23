package com.bridgelabz;

public class EmployeeWageComputation {
    public static void main(String[] args)
    {
        getWelcomeMsg();

        Employee e1 = new Employee();
        e1.totalWage();

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
    int totalWage = 0;

    int MAXI_WORKING_DAYS = 20;
    int MAXI_WORKING_HRS = 100;
    int result = 0;

    public void totalWage()
    {
        int workingHours=0;
        for (int day = 1, totalWorkingHrs = 0; day <= MAXI_WORKING_DAYS
                && totalWorkingHrs < MAXI_WORKING_HRS; day++, totalWorkingHrs += workingHours)
        {
            int empType = (int) (Math.random() * 100) % 3;
            switch (empType) {
                case FULL_TIME:
                    workingHours = 8;
                    break;
                case PART_TIME:
                    workingHours = 4;
                    break;
                default:
                    workingHours=0;
                    break;
            }
            int wage = workingHours * WAGE_PER_HOUR;
            totalWage =totalWage + wage;

        }
        System.out.println("Total wage for a month is " + totalWage);
    }
}

