import java.lang.*;
import java.util.*;
class Date
{  Integer date;
    Integer Month;
    Integer year;
    public Date(Integer d,Integer Month,Integer year)
    {
        this.date=d;
        this.Month=Month;
        this.year=year;
    }

    @Override
    public String toString() {
        return date+"-"+Month+"-"+year;
    }
}
class DOBColl
{
    public static void main(String args[])
    {
        LinkedList<Date> list=new LinkedList<>();
        Date d1=new Date(8,6,2001);
        Date d2=new Date(27,11,1997);
        Date d3=new Date(7,4,2011);
        Date d4=new Date(15,10,2000);
        Date d5=new Date(4,2,2021);
        list.add(d1);
        list.add(d2);
        list.add(d3);
        list.add(d4);
        list.add(d5);
        System.out.println(list);
        Iterator<Date> itr=list.iterator();
        while(itr.hasNext())
        {
            Date d=(Date)itr.next();
            Integer date=d.date;
            Integer month=d.Month;
            Integer year=d.year;
            if(year%400==0)
            {
                System.out.println("The date of birth is "+date+"-"+month+"-"+year+" is leap year");
            }
            else if(year%100==0)
            {
                System.out.println("The date of birth is "+date+"-"+month+"-"+year+" is not leap year");
            }
            else if(year%4==0)
            {
                System.out.println("The date of birth is "+date+"-"+month+"-"+year+" is leap year");
            }
            else {
                System.out.println("The date of birth is "+date+"-"+month+"-"+year+" is not leap year");
            }
        }

    }
}



