

package com.company;

import java.util.Scanner;

public class CTC {
    public static void main(String[] args)
    {
        double tax,Incm;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter income ");
        Incm=sc.nextDouble();
        if(Incm<=180000)
            tax=0;
        else if(Incm<=300000)
            tax=0.1*(Incm-181000);
        else if(Incm<=500000)
            tax=(0.2*(Incm-300000))+(0.1*100000);
        else if(Incm<=1000000)
            tax=(0.3*(Incm-500000))+(0.2*200000)+(0.1*180000);
        else
            tax=(0.4*(Incm-1000000))+(0.3*500000)+(0.2*200000)+(0.1*100000);
        System.out.println("Income tax amount is "+tax);
    }
}


