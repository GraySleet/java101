package com.mhisoft.matthew.learningjava.effectivejava;

import java.sql.SQLOutput;
import java.util.Set;
import java.util.*;
import java.util.TreeMap;
public class generic<E> {


    public static <E> Set<E> union(Set<E> s1, Set<E> s2){

        Set<E> result = new HashSet<E>(s1);
        result.addAll(s2);
        return result;
    }

    public static void main(String[] args) {
       Set<String> guys = new HashSet<String>(
               Arrays.asList("Tom", "Dick", "Harry"));
       Set<String> stooges = new HashSet<String>(
               Arrays.asList("Larry", "Moe", "Curly"));
               Set<String> aflCio = union(guys, stooges);
        System.out.println(aflCio);

        HashMap<Double, String > elements = new HashMap<>();
        elements.put(1.0, "hydrogen");
        elements.put(4.0, "helium");
        elements.put(6.9, "lithium");
        elements.put(9.0, "beryllium");
        elements.put(10.8, "boron");
        elements.put(12.0, "carbon");
        elements.put(14.0, "nitrogen");
        elements.put(16.0, "oxygen");
        elements.put(19.0, "flourine");
        elements.put(20.1, "neon");

           Map<Double, String> map = new TreeMap<Double, String>(elements);

        //create arraylist and put all the keys from map to it
        //sort the arraylist
        //iter

        Set<Double> set1 = map.keySet();
        for(Double key : set1) {
            System.out.println(key+ " : " + map.get(key));
        }


        map.entrySet()
                .stream()
                .sorted(Map.Entry.<Double, String>comparingByKey())
                .forEach(System.out::println);

            List<Double> key = new ArrayList<Double>(map.keySet());
        Collections.sort(key);
        System.out.println(key);

        List<String> value = new ArrayList<String>(map.values());
        Collections.sort(value);
        System.out.println(value);
        }


    }
