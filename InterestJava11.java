package com.company;


interface SimpleInterest
{
    int simpleInterest(int a, int b, int c);
}

public class InterestJava11
{
    public static void main(String args[])
    {
        SimpleInterest silambda = ( var P, var R, var T)->
        {
            System.out.println((P*T*R)/100);
            return (P*T*R)/100;
        };
        silambda.simpleInterest(20000,2,2);
    }
}
