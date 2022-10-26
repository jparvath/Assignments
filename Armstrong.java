package com.company;

public class Armstrong {
    public static void main(String args[])
    {
        int a=153,re,sum=0,b;
        b=a;
        while(a>0) {
            re = a % 10;
            sum = sum +(re * re * re);
            a = a / 10;
        }
        if(sum==b) {
            System.out.println(b+"it is an armstrong number");
        }
        else
        {
            System.out.println(b+"it is not an armstrong number");
        }
    }
}
