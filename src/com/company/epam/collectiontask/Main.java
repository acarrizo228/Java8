package com.company.epam.collectiontask;

import java.util.*;

/**
 * Created by Vladyslav_Lyshchuk on 5/23/2019.
 */
public class Main {
    static int range = 0;
    static int number = 0;

    static List<Integer> list  = new ArrayList<>(10);
    static Set<Integer> set = new HashSet<>();

    public static void main(String[] args) {
        Random random = new Random();
        System.out.print("Enter range: ");
        range = inputInt();

        System.out.print("Enter number of element: ");
        number = inputInt();

        for (int i = 0; i < number; i++) {
            addToList(random.nextInt(range));
        }

        System.out.println(list);
        System.out.println(set);

    }

    public static int inputInt(){
        Scanner sc = new Scanner (System.in);
        int number = sc.nextInt();
        return number;
    }

    public static void addToList(int number){
        list.add(number);
        set.add(number);
    }

}
