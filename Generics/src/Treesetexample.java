package com.company;
import java.util.Collection;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.Scanner;
import java.lang.String;
import java.util.*;
class Treeset
{
    int id;
    String name;
    String department;
    int salary;
    Treeset(int id, String name, String department, int salary)
    {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    @Override
    public String toString()
    {
        return "Treeset{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
class Sortbyid implements Comparator<Treeset>
{
    public int compare(Treeset a, Treeset b)
    {
        return a.id - b.id;
    }
}
class Sortbysalary implements Comparator<Treeset>
{
    public int compare(Treeset a, Treeset b)
    {
        return a.salary - b.salary;
    }
}
class Sortbyname implements Comparator
{
    public int compare(Object str1, Object str2)
    {
        String i1=str1.toString();
        String i2= str2.toString();
        return i2.compareTo(i1);
    }

}
class Sortbydepartment implements Comparator
{
    public int compare(Object str1, Object str2)
    {
        String i1=str1.toString();
        String i2= str2.toString();
        int l1=i1.length();
        int l2=i2.length();
        if(l1>l2)
            return -1;
        else if(l1<l2)
            return 1;
        else
            return i1.compareTo(i2);
    }

}
public class Treesetexample
{
    public static void main(String[] args)
    {
        String name;
        int id;
        String department;
        int salary;
        Scanner s = new Scanner(System.in);

        Treeset t1 = new Treeset(1, "a", "B", 10000);
        Treeset t2 = new Treeset(2, "b", "c", 20000);
        Treeset t3 = new Treeset(3, "c", "a", 30000);
        Treeset t4 = new Treeset(4, "d", "j", 40000);
        Treeset t5 = new Treeset(11, "e", "k", 50000);
        Treeset t6 = new Treeset(6, "f", "l", 60000);
        Treeset t7 = new Treeset(7, "g", "m", 70000);
        Treeset t8 = new Treeset(8, "h", "n", 80000);
        Treeset t9 = new Treeset(9, "i", "o", 1000);
        Treeset t10 = new Treeset(10, "j", "p", 100000);
        System.out.println("choose 1 for name/n choose 2 for department /n choose 3 for salary/n choose 4 for id");
        int choose = s.nextInt();
        switch (choose)
        {
            case 1:
                TreeSet<Treeset> s1 = new TreeSet<>(new Sortbyid());
                s1.add(t1);
                s1.add(t2);
                s1.add(t3);
                s1.add(t4);
                s1.add(t5);
                s1.add(t6);
                s1.add(t7);
                s1.add(t8);
                s1.add(t9);
                s1.add(t10);
                System.out.println(s1);
                break;
            case 2:
                TreeSet<Treeset> s2 = new TreeSet<>(new Sortbysalary());
                s2.add(t1);
                s2.add(t2);
                s2.add(t3);
                s2.add(t4);
                s2.add(t5);
                s2.add(t6);
                s2.add(t7);
                s2.add(t8);
                s2.add(t9);
                s2.add(t10);
                System.out.println(s2);
                break;
            case 3:
                TreeSet<Treeset> s3=new TreeSet<Treeset>( new Sortbyname());
                s3.add(t1);
                s3.add(t2);
                s3.add(t3);
                s3.add(t4);
                s3.add(t5);
                s3.add(t6);
                s3.add(t7);
                s3.add(t8);
                s3.add(t9);
                s3.add(t10);
                System.out.println(s3);
                break;
            case 4:
                TreeSet<Treeset> s4=new TreeSet<Treeset>( new Sortbydepartment());
                s4.add(t1);
                s4.add(t2);
                s4.add(t3);
                s4.add(t4);
                s4.add(t5);
                s4.add(t6);
                s4.add(t7);
                s4.add(t8);
                s4.add(t9);
                s4.add(t10);
                System.out.println(s4);

        }

    }
}

