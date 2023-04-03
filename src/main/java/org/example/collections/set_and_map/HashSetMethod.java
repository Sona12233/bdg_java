package org.example.collections.set_and_map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class HashSetMethod {

    /**
     * 1.a Write a program that takes two HashSets of
     * integers and finds the common elements between them.
     *
     * @param h1
     * @param h2
     * @return
     */
    public HashSet<Integer> hashSetOfIntegers(HashSet h1, HashSet h2) {
        HashSet<Integer> h3 = new HashSet<>();
        for (Object integer1 : h1) {
            for (Object integer2 : h2) {
                if (integer1.equals(integer2)) h3.add((Integer) integer1);

            }
        }
        return h3;
    }

    /**
     * 1b. Create a HashSet of custom objects with a name and age field.
     * Then, write a comparator to sort the objects by age and print
     * out the objects in order of increasing age.
     */
    public void orderByIncreasingAge() {
        HashSet<Person> hashSet = new HashSet<>();
        hashSet.add(new Person(21, "Sona"));
        hashSet.add(new Person(20, "Lilie"));
        hashSet.add(new Person(22, "Eric"));

        ArrayList arrayList = new ArrayList(hashSet);

        Collections.sort(arrayList);
        for (Object o : arrayList) {
            System.out.println(o);
        }
    }

    public HashSet<String> uniqueStrings(){
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Sona");
        hashSet.add("sona");
        hashSet.add("Lilie");


        HashSet<String> newHashSet = new HashSet<>();
        for (String string : hashSet) {
            String lowerCase = string.toLowerCase();
            if (!newHashSet.contains(lowerCase))
                newHashSet.add(lowerCase);
        }
        System.out.println("Original hashset: " + hashSet);
        System.out.println("Only unique members: " + newHashSet);
        return newHashSet;
    }


}
