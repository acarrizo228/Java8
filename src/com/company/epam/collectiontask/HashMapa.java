package com.company.epam.collectiontask;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Vladyslav_Lyshchuk on 5/27/2019.
 */
public class HashMapa {
    public static void main(String[] args) {
        HashMap<String, String> vocabulary = new HashMap<>();
        vocabulary = addNewWord(vocabulary);
        System.out.println(vocabulary);

        System.out.print("Enter english word to translate: ");
        String wordToTranslate = inputString();
        translate(vocabulary, wordToTranslate);
    }

    public static HashMap addNewWord(HashMap<String, String> list){
        for(int i = 0; i < 2; i++) {
            System.out.print("Enter english word: ");
            String englishWord = inputString();
            System.out.print("Enter russian word: ");
            String russianWord = inputString();
            list.put(englishWord, russianWord);
        }
        return list;
    }
    public static void translate(HashMap<String, String> list, String word){

        for (String trans : word.split(" ")) {
            if(list.get(trans) != null){
                System.out.print(list.get(trans) + " ");
            }
            else {
                System.out.print(trans + " ");
            }
        }
    }

    public static String inputString(){
        Scanner sc = new Scanner (System.in);
        String word = sc.nextLine();
        return word;
    }
}
