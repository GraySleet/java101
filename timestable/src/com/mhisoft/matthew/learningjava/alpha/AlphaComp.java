package com.mhisoft.matthew.learningjava.alpha;
import java.util.*;
public class AlphaComp implements Comparator{
    public int compare(Object o1, Object o2){
        String s1=((String)o1).toLowerCase();
        String s2=((String)o1).toLowerCase();
        return s1.compareTo(s2);
    }
    public static void main(String[] args){
        String[] s = ArraysTookbox.randStrings(4, 10);
        ArraysTookbox.print(s);
        AlphaComp ac = new AlphaComp();
        Arrays.sort(s, ac);


        ArraysTookbox.print(s);
        int loc = Arrays.binarySearch(s, s[3], ac);
        System.out.println("Location of " + s[3] + "=" + loc);
    }
}
