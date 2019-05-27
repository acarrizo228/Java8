package com.company.epam.java8task;

import java.util.Scanner;

public class Array {

    public static Integer[] createArray(){
        int sizeOfArray = inputInt();
        Integer[] array = new Integer[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            array[i] = (int) ((Math.random() * 20) - sizeOfArray);
        }
        return array;
    }

    public static int inputInt(){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter size of array: ");
        int number = sc.nextInt();
        return number;
    }

    public static void printArray(Integer array[]){
        System.out.print("Show Array: ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}


