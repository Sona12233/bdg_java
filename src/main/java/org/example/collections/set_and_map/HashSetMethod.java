package org.example.collections.set_and_map;

import java.util.*;

public class HashSetMethod {

    /**
     * 1.a Write a program that takes two HashSets of integers and finds the common elements between them.
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
     * 1b. Create a HashSet of custom objects with a name and age field. Then, write a comparator to sort the objects by age and print out the objects in order of increasing age.
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

    /**
     * 1c.Write a program that takes a HashSet of strings and returns a new HashSet containing only the unique words in the original set, ignoring case.
     *
     * @return
     */
    public HashSet<String> uniqueStrings() {
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

    /**
     * 2a. Write a program that takes in a LinkedHashSet of integers and removes any even numbers from the set.
     *
     * @param lHashSet
     * @return
     */
    public LinkedHashSet<Integer> oddNumbers(LinkedHashSet<Integer> lHashSet) {
        LinkedHashSet<Integer> oddMembers = new LinkedHashSet<>();
        for (Integer i : lHashSet) {
            if (i % 2 == 1) {
                oddMembers.add(i);
            }
        }
        return oddMembers;
    }

    /**
     * 2b. Create a LinkedHashSet of custom objects with a name and age field. Then, write a comparator to sort the objects by age and print out the objects in order of increasing age.
     */
    public void orderByIncreasingAge2() {
        LinkedHashSet<Person> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(new Person(32, "Lisa"));
        linkedHashSet.add(new Person(21, "Sona"));
        linkedHashSet.add(new Person(25, "Susie"));

        ArrayList arrayList = new ArrayList(linkedHashSet);
        Collections.sort(arrayList);
        for (Object o : arrayList) {
            System.out.println(o + " ");
        }
    }

    /**
     * 2c. Write a program that takes in a LinkedHashSet of custom objects and removes any objects that have a duplicate name field.
     */
    public void removeDuplicates() {
        LinkedHashSet<Person> lHashSet = new LinkedHashSet<>();
        lHashSet.add(new Person(32, "Lisa"));
        lHashSet.add(new Person(12, "Lisa"));
        lHashSet.add(new Person(21, "Sona"));

        LinkedHashSet<String> names = new LinkedHashSet<>();
        LinkedHashSet<Person> uniqueSet = new LinkedHashSet<>();
        for (Person person : lHashSet) {
            if (!names.contains(person.getName())) {
                uniqueSet.add(person);
                names.add(person.getName());
            }
        }

        System.out.print("\nOriginal set: \n");
        for (Person person : lHashSet) {
            System.out.println("    " + person);
        }

        System.out.print("\nUnique set: \n");
        for (Person person : uniqueSet) {
            System.out.println("    " + person);
        }
    }

    /**
     * 3a. Create a TreeSet of custom objects with a name and age field. Then, write a comparator to sort the objects by age and print out the objects in order of increasing age.
     */
    public void orderByIncreasingAge3() {
        TreeSet<Person> treeSet = new TreeSet<>();
        treeSet.add(new Person(21, "Sona"));
        treeSet.add(new Person(30, "Vera"));
        treeSet.add(new Person(25, "Clara"));

        ArrayList<Person> arrayList = new ArrayList(treeSet);
        Collections.sort(arrayList);
        for (Object o : arrayList) {
            System.out.println(o + " ");
        }
    }

    /**
     * 3b. Write a program that takes in two TreeSets of integers and returns a new set containing only the elements that are in the first set but not in the second set.
     *
     * @return
     */
    public TreeSet<Integer> containsOnlyFistSet() {
        TreeSet<Integer> treeSet1 = new TreeSet<>(List.of(1, 3, 5, 6));
        TreeSet<Integer> treeSet2 = new TreeSet<>(List.of(0, 3, 2, 6));

        TreeSet<Integer> treeSet = new TreeSet<>();

        System.out.println("\nOriginal list one` " + treeSet1);
        System.out.println("\nOriginal list two` " + treeSet2);

        for (Integer i : treeSet1) {
            if (!treeSet2.contains(i)) {
                treeSet.add(i);
            }
        }
        System.out.println("\nUnique set` " + treeSet);
        return treeSet;
    }

    /**
     * 3c. Write a program that takes in a TreeSet of strings and returns a new set containing only the unique words in the original set, ignoring case.
     *
     * @return
     */
    public TreeSet<String> uniqueString3() {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Aaa");
        treeSet.add("aaa");
        treeSet.add("BBB");
        System.out.println("\nOriginal list: " + treeSet);

        TreeSet<String> uniqueTreeSet = new TreeSet<>();
        for (String s : treeSet) {
            String lowerCase = s.toLowerCase();
            if (!treeSet.contains(lowerCase)) ;
            uniqueTreeSet.add(lowerCase);
        }
        System.out.println("\nUnique elements: " + uniqueTreeSet);
        return uniqueTreeSet;
    }


    public int anagramPair() {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(0, "dog");
        hashMap.put(1, "act");
        hashMap.put(2, "mice");
        hashMap.put(3, "god");
        hashMap.put(4, "cat");
        hashMap.put(5, "odg");

        int temp1 = 0;
        int temp2 = 0;
        int counter = 0;
        for (int i = 0; i < hashMap.size() - 1; i++) {
            for (int k = 0; k < hashMap.get(i).length(); k++) {
                temp1 += hashMap.get(i).charAt(k);
            }
            for (int j = i + 1; j < hashMap.size(); j++) {
                for (int k = 0; k < hashMap.get(j).length(); k++) {
                    temp2 += hashMap.get(j).charAt(k);
                }
                if (temp1 == temp2){
                    counter++;
                }
                temp2 = 0;
            }
            temp1 = 0;
        }
        return  counter;
    }


}
