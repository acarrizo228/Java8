package com.company.epam.java8task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Vladyslav_Lyshchuk on 5/23/2019.
 */
public class TaskStream {
    public static void main(String[] args) {
        task1();


        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("Vlad",20,"male", "Yes"));
        list.add(new Person("Max",20,"male", "No"));
        list.add(new Person("Sasha",24,"male", "Yes"));
        list.add(new Person("Masha",25,"female", "Yes"));
        list.add(new Person("Vika",20,"female", "Yes"));
        task3(list);
    }

    public static int inputInt(){
        Scanner sc = new Scanner (System.in);
        int number = sc.nextInt();
        return number;
    }

    public static String inputString(){
        Scanner sc = new Scanner (System.in);
        String text = sc.nextLine();
        return text;
    }

    public static void task1() {
        List<Integer> list = Stream.iterate(10, x -> x + 10)
                .limit(10)
                .map(x -> x / 2)
                .collect(Collectors.toList());

        System.out.println(list);
    }


    public static void task2(HashMap<String,String> list){

    }
    public static void task3(ArrayList<Person> list) {
        System.out.println("\nMilitary men");
        list.stream()
                .filter(army -> army.isArmyMan() == "Yes")
                .forEach(System.out::println);

        System.out.println("\nAverage age of women");
        list.stream()
                .filter(army -> army.isArmyMan() == "Yes" && army.getGender() == "female")
                .mapToInt(i -> i.age)
                .average()
                .ifPresent(avg -> System.out.println("Average found is " + avg));
    }
}

class Person {
    String name;
    int age;
    String gender;
    String armyMan;

    public Person(String name, int age, String gender, String armyMan) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.armyMan = armyMan;
    }
//    public Person() {
//        return;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String isArmyMan() {
        return armyMan;
    }

    public void setArmyMan(String armyMan) {
        this.armyMan = armyMan;
    }

    @Override
    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", gender='" + gender + '\'' +
//                ", armyMan=" + armyMan +
//                '}';
        return "Name: " + name + '\'' +
                ", age: '" + age + '\'';
    }
}
