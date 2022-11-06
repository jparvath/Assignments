package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
class Fruit
{
    String name;
    int calories;
    int price;
    String color;
    Fruit(String name, int calories, int Price, String color) {
        this.name = name;
        this.calories = calories;
        this.price = price;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ",calories='" + calories +
                ",price=" + price +
                ",color='" + color + '\'' +
                '}';
    }
}
public class FruitStream {
    public static void main(String args[]) {
        List<Fruit> fruits = Arrays.asList(
                new Fruit("Apple", 80, 100, "Red"),
                new Fruit("Mango", 110, 150, "Yellow"),
                new Fruit("Orange", 60, 80, "Orange"),
                new Fruit("Cherries", 50, 50, "Red"),
                new Fruit("Banana", 70, 40, "Yellow"),
                new Fruit("Guava", 150, 120, "Green")
        );
        System.out.println(fruits);
        System.out.println("List of fruits sorted by calories");
        fruits.stream().filter(p ->p.getCalories()<100).sorted((Fruit o1, Fruit o2) ->(int)o2.getCalories()-o1.getCalories()).forEach(p -> System.out.println(p.getName()));
        System.out.println("List of fruits sorted by color");
        fruits.stream().sorted(new Comparator<Fruit>() {
            @Override
            public int compare(Fruit o1, Fruit o2)
            {
                return o1.getColor().compareTo(o2.getColor());
            }
        }).forEach(p ->System.out.println(p.getName()));
        System.out.println("List of fruits whose color red sorted by price");
        fruits.stream().filter(p ->p.getColor().equalsIgnoreCase("Red")).sorted((Fruit o1,Fruit o2)->(int)o1.getPrice()-o2.getPrice()).forEach(p ->System.out.println(p.getName()));
    }
}

