package com.company.epam.task1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Инициализация массива
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter size of array: ");
        int sizeOfArray = sc.nextInt();


        Integer array[] = new Integer[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            array[i] = (int) ((Math.random() * 12) - sizeOfArray);
        }

        // вывод созданого массива
        System.out.println("Show array: ");
        printArray(array);

        // Метод для сортировки массива в порядке убивания
        System.out.println("Show sort array: ");
        Arrays.sort(array,(Integer::compareTo));
        printArray(array);

    }

    public static void printArray(Integer array[]){
        System.out.print("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

//    public static Integer createArray(int size){
//        Integer[] newArray = new Integer[size];
//        for (int i = 0; i < size; i++) {
//            newArray[i] = (int) ((Math.random() * 10) - size);
//        }
//        return newArray[size];
//    }
}


