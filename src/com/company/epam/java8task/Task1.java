package com.company.epam.java8task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class Task1 {
    public static void main(String[] args) {
        taskArray();
        taskList();

    }

    public static void taskArray(){
        Integer array[];
        array = Array.createArray();
        Array.printArray(array);

        Arrays.sort(array,(a, b) -> b.compareTo(a));
        System.out.println("Show sort array: ");
        Array.printArray(array);


    }

    public static void taskList(){
        ArrayList<String> array = new ArrayList<>();

        Scanner sc = new Scanner (System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter new word in list: ");
            array.add(sc.nextLine());
        }

        System.out.println(array);

        array.sort((a,b) -> b.compareTo(a));
        System.out.println(array);
    }

}
