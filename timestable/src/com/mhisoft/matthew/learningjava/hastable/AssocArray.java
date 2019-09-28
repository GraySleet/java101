package com.mhisoft.matthew.learningjava.hastable;

import java.util.*;


public class AssocArray extends Dictionary
{
    private Vector keys = new Vector();
    private Vector values = new Vector();

    public int size() {
        return keys.size();
    }

    public boolean isEmpty() {
        return keys.isEmpty();
    }


    public Object put(Object key, Object value) {
        keys.addElement(key);
        values.addElement(value);
        return key;
    }

    public Object get(Object key) {
        int index = keys.indexOf(key);
        if (index == -1) return null;
        return values.elementAt(index);
    }

    public Object remove(Object key) {
        int index = keys.indexOf(key);
        if (index == -1) return null;
        keys.removeElementAt(index);
        Object returnval = values.elementAt(index);
        values.removeElementAt(index);
        return returnval;
    }


    public Enumeration keys() {
        return keys.elements();
    }

    public Enumeration elements() {
        return values.elements();
    }

    public static void main(String[] args) {
        AssocArray table = new AssocArray();
        for (char c = 'a'; c <= 'z'; c++)
            table.put(String.valueOf(c),
                    String.valueOf(c).toUpperCase());

        char[] ca = {'a', 'e', 'i', 'o', 'u', 'p'};
        for (int i = 0; i < ca.length; i++)
            System.out.println("Uppercase: " + table.get(String.valueOf(ca[i])));
    }
}