package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Thank you for using Payroll calculator.");

        Scanner read = new Scanner(System.in);

//        Having the user input their name.
        System.out.println("What is your name?");
        String name = read.nextLine();
        System.out.println("Hello there, " + name);

//        Asking the user how many hours they worked.

        System.out.println("How many hours have you worked?");
        float hoursWorked = read.nextFloat();
        System.out.println("The hours you worked are: " + hoursWorked);

//        Asking the user for their pay rate
        System.out.println("What is your current pay rate?");
        float payRate = read.nextFloat();
        System.out.println("Your pay rate is: " + payRate);

        float grossPay = hoursWorked * payRate;
        System.out.println("Your gross pay is: $" + grossPay);

        read.nextLine(); // This is so the system will eat the line and allow us to switch back to string.

//        Seeing if the user needs any further assistance. Currently, it is set to respond the same either way.
        System.out.println("Is there anything else I can do for you?");
        String responseBack = read.nextLine();
        System.out.println("Your response was: " + responseBack);
        System.out.println("Have a nice day!");

        System.out.printf("Summary\n name: %s \n Hours worked: %f\n Pay Rate: %f \n Gross Pay: %.2f", name, hoursWorked, payRate, grossPay);

        read.close();

    }
}
