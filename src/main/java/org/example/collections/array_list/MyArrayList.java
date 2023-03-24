package org.example.collections.array_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MyArrayList<T> implements Iterable<T> {
    private List<T> list = new ArrayList<>();
    private T[] elements;
    private int size;
//    /**
//     * 1. Write a Java program to iterate through all elements in a array list.
//     *
//     * @param list
//     */
//    public void iterate(List<String> list) {
//        for (String temp : list) {
//            System.out.println(temp);
//        }
//
//        Iterator<String> i = list.iterator();
//        while (i.hasNext()) {
//            System.out.println(i.next());
//        }
//    }

    /**
     * 1. iterates through all elements in a array list.
     *
     * @return
     */
    @Override
    public Iterator<T> iterator() {
        return new MyIterator<>();
    }

    /**
     * 2. inserts an element into the array list at the first position.
     * @param element
     * @return
     */
    public boolean myAdd(T element){
        //this.size++;
        ensureCapasity(this.size + 1);
        elements[this.size++] = element;
        return true;
    }

    /**
     * Increases the capacity of this ArrayList
     * @param needCapasity
     */
    private void ensureCapasity(int needCapasity){
        if(needCapasity > elements.length){
            Object[] oldElements = this.elements;
            int newSize = this.size * 2 + 1;
            this.elements = (T[]) new Object[newSize];
            this.elements = (T[]) Arrays.copyOf(oldElements, newSize);
        }
    }

    /**
     * 3. updates specific array element by given element.
     * @param index
     * @param element
     * @return
     */
    public boolean mySet(int index, T element){
        if (index >= 0 && index < this.size){
            elements[index] = element;
        } return true;
    }

    public int mySize(){
        return this.size;
    }


    public class MyIterator<E> implements Iterator<E> {
        int indexPosition = 0;

        /**
         * Checks whether there is next element or not
         *
         * @return true if there is next element, and false if there is not
         */
        @Override
        public boolean hasNext() {
            return this.indexPosition < mySize();
        }

        /**
         * If present, gives the next element
         * @return the next element
         */
        @Override
        public E next() {
            E value = (E) elements[indexPosition++];
            return value;
        }
    }
}
