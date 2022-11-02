package com.company;
import java.util.ArrayList;
import java.util.List;

public class ClientDemo {
    public static void main(String[] args) {
        List<Integer>intArrayList1=new ArrayList<>();
        intArrayList1.add(1);
        intArrayList1.add(2);
        intArrayList1.add(3);
        intArrayList1.add(4);
        intArrayList1.add(5);
        System.out.println(intArrayList1);
        System.out.println("This is arraylist");
        List<Integer>intArrayList2=new ArrayList<>(8);
        intArrayList2.add(10);
        intArrayList2.add(20);
        intArrayList2.add(30);
        intArrayList2.add(40);
        intArrayList2.add(50);
        System.out.println(intArrayList2);
        System.out.println("array elements");
        List<Integer>intArrayList3=new ArrayList<>();
        intArrayList3.add(100);
        intArrayList3.add(200);
        System.out.println(intArrayList3);


    }
}