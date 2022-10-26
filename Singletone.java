package com.company;

import jdk.swing.interop.SwingInterOpUtils;

class Singletone
{
  private static Singletone Single_instance = null;

  public String s;

  private Singletone() { s = "Hello i am string part of a Singletone class";}

    public static Singletone getInstance()
    {
        if (Single_instance == null)
            Single_instance = new Singletone();

        return Single_instance;
    }
}
class CFG
{
    public static void main(String args[])
    {
        Singletone x = Singletone.getInstance();
        Singletone y = Singletone.getInstance();
        Singletone z = Singletone.getInstance();

        System.out.println("Hashcode of x is" + x.hashCode());
        System.out.println("Hashcode of y is" + y.hashCode());
        System.out.println("Hashcode of z is" + z.hashCode());

        if(x == y && y == z)
        {
            System.out.println("Three objects point to the same memory location on the heap i.e, to the same object");
        }
        else
        {
            System.out.println("Three objects DO NOT point to the same memory location on the heap");
        }
    }
}