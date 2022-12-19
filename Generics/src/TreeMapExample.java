package com.company;
import java.lang.String;
import java.util.Collection;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.*;
class Contact
{
    String name;
    String email;
    char gender;
    Contact(String name,String email,char gender)
    {

        this.name = name;
        this.email = email;
        this.gender = gender;
    }
}
class Number
{
    int phno;

    Number(int phno)
    {
        this.phno = phno;
    }

    public int getphno()
    {
        return phno;
    }

    @Override
    public String toString()
    {
        return "Number{" +
                "phno=" + phno +
                '}';
    }
}

class Sortbyphno implements Comparator<Number>
{
    public  int compare(Number a,Number b)
    {
        return a.phno-b.phno;

    }
}
public class TreeMapExample
{
    public static void main(String[] args)
    {
        Contact t=new Contact("abd","abc@gmail.com",'f');
        Number l=new Number(7634528);
        TreeMap<Contact,Number> t1=new TreeMap<Contact,Number>();

        t1.put(t,l);
        Set s=t1.keySet();
        System.out.println(s);
        Collection c=t1.values();
        System.out.println(c);
        Set k=t1.entrySet();
        System.out.println(k);
    }
}

