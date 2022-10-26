package com.company;

import java.util.Scanner;

public class CompoundInterest
{
    public static void main(String args[])
    {
     Scanner input = new Scanner(System.in);

        System.out.println("enter the principal: ");
        double principal = input.nextDouble();
        System.out.println("enter the rate: ");
        double rate = input.nextDouble();
        System.out.println("enter the time: ");
        double time = input.nextDouble();
        System.out.println("enter number of times interest is compounded: ");
        int number = input.nextInt();

        double interest = principal * (Math.pow((1 + rate/100), (time * number))) - principal;

        System.out.println("Principal: " + principal);
        System.out.println("Interest Rate: " + rate);
        System.out.println("Time Duration: " + time);
        System.out.println("Number of time interest compounded: " + number);
        System.out.println("Compound Interest: " + interest);

        input.close();
    }
}
