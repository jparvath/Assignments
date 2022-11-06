package com.company;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Test
{

}
class Annotation1 {
    @Test
    public int testcase()
    {
        int a=1234;
        return a;
    }
    public static void main(String agrs[])
    {
        Annotation1 t = new Annotation1();
        System.out.println(t.testcase());
    }
}




