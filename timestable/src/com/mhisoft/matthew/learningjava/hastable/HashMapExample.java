package com.mhisoft.matthew.learningjava.hastable;

import java.util.*;


public class HashMapExample {

    public static void main(String[] args) {
        //this is our table.
        Map<String, String> table = new HashMap<>();

        for (char c = 'a'; c <= 'z'; c++)
            table.put(String.valueOf(c),
                    String.valueOf(c).toUpperCase());

        char[] ca = {'a', 'e', 'i', 'o', 'u', 'p'};
        for (int i = 0; i < ca.length; i++)
            System.out.println("Uppercase: " + table.get(String.valueOf(ca[i])));
    }


}