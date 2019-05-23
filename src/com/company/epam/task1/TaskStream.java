package com.company.epam.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Vladyslav_Lyshchuk on 5/23/2019.
 */
public class TaskStream {
    public static void main(String[] args) {
        task1();

        ArrayList<Object> list = new ArrayList<>();
        Person person;
        for(int i = 0; i < 3 ; i++) {
            System.out.println("Enter name: ");
            String name = inputString();
            System.out.println("Enter age: ");
            int age = inputInt();
            System.out.println("Enter gender: ");
            String gender = inputString();
            boolean armyMan = true;

            list.add(new Person(name, age, gender, armyMan));
        }
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
}

class Person {
    String name;
    int age;
    String gender;
    boolean armyMan;

    public Person(String name, int age, String gender, boolean armyMan) {
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

    public boolean isArmyMan() {
        return armyMan;
    }

    public void setArmyMan(boolean armyMan) {
        this.armyMan = armyMan;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", armyMan=" + armyMan +
                '}';
    }
}
