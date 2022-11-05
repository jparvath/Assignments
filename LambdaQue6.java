package com.lambda;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
public class LambdaQue6
{
    public static void main(String args[])
    {
        List<String> list = Arrays.asList("america", "india", "paris", "spain", "usa", "uk");
        LambdaQue6 Letter = new LambdaQue6();
        System.out.println(Letter.convertToUpperCase(list));
    }

    public List<String> convertToUpperCase(List<String> list)
    {
        List<String> ToUpper = new ArrayList<>();
        Consumer<String> consumer = (str) -> ToUpper.add(str.toUpperCase());
        list.stream()
                .forEach(consumer);
        return ToUpper;
    }
}