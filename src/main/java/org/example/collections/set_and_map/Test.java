package org.example.collections.set_and_map;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Test {

    public static void main(String[] args) {
        HashSetMethod obj = new HashSetMethod();
        //1a
//        HashSet<Integer> h1 = new HashSet<>();
//        h1.add(5);
//        h1.add(2);
//        h1.add(1);
//        HashSet<Integer> h2 = new HashSet<>();
//        h2.add(2);
//        h2.add(5);
//        System.out.println(obj.hashSetOfIntegers(h1, h2));
//
        //1b
//        obj.orderByIncreasingAge();

        //1c
//        obj.uniqueStrings();

        //2a
//        LinkedHashSet<Integer> l = new LinkedHashSet<>();
//        l.add(28);
//        l.add(27);
//        l.add(32);
//        l.add(11);
//        l.add(222);
//        System.out.println(obj.oddNumbers(l));

        //2b
//        obj.orderByIncreasingAge2();

        //2c
//        obj.removeDuplicates();

        //3a
//        obj.orderByIncreasingAge3();

        //3b
//        obj.containsOnlyFistSet();

        //3c
//        obj.uniqueString3();

        //4b
        System.out.println(obj.anagramPair());
    }

}
