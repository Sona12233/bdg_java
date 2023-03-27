package org.example.collections.array_list;

import java.util.*;

public class MyArrayList<E> extends AbstractList<E> implements List<E> {
    private int initialCapacity = 10;
    private int size;
    private int index;
    private E[] array = (E[]) new Object[initialCapacity];

    /**
     * 9. If array's size is bigger than capacity, this method creates
     * new array of size = size + capacity
     */
    public void createNewArray() {
        int newCapacity = initialCapacity + 16;
        E[] newArray = (E[]) new Object[newCapacity];
        System.arraycopy(array, 0, newArray, 0, initialCapacity);
        array = newArray;
        initialCapacity = newCapacity;
    }

    /**
     * 1. IterateS through all elements in a array list.
     */
    public void iterateAllElements() {
        for (E temp : array) {
            System.out.println(temp);
        }
    }


    /**
     * 8. Cheks wheter array is empty or not
     *
     * @return
     */
    public boolean isEmpty() {
        if (array[0] == null) return true;
        return false;
    }

    /**
     * Returns array's size
     *
     * @return size
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * @param o element whose presence in this list is to be tested
     * @return
     */
    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < array.length; i++) {
            if (o.equals(array[i])) return true;
        }
        return false;
    }

    public E[] reverse() {
        E[] newArr = (E[]) new Object[array.length];
        int index = 0;
        for (int i = size - 1; i >= 0; i--) {
            newArr[index] = array[i];
            index++;
        }
        for (int i = 0; i < size; i++) {
            array[i] = newArr[i];
        }
        return array;
    }

    /**
     * 2. inserts an element into the array list at the first position.
     *
     * @param element
     * @return
     */
    public E[] insert(E element) {
        size++;
        for (int i = size - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = element;
        return array;
    }

    /**
     * 3.
     *
     * @param index   index of the element to replace
     * @param element element to be stored at the specified position
     * @return
     */
    public E[] set(int index, E element) {
        if (index >= size || index < 0)
            throw new ArrayIndexOutOfBoundsException();
        else {
            for (int i = 0; i < size; i++) {
                if (i == index) array[index] = element;
                return array; // if index is replaced
            }
        }
        return array; //if nothing is changed
    }


    /**
     * @param oldElement to replace
     * @param newElement element to be stored at oldElements position
     * @return
     */
    public E[] replace(E oldElement, E newElement) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(oldElement)) {
                array[i] = newElement;
                return array; // if a change is made
            }
        }
        System.out.println("List does not contain given element");
        return array; // if no changes are made
    }

    /**
     * 4. Search by index
     *
     * @param index
     * @return
     */
    public E searchByIndex(int index) {
        if (index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        System.out.println(array[index]);
        return array[index];
    }

    /**
     * Search by element
     *
     * @param element
     */
    public void searchByElement(E element) {
        for (int i = 0; i < size; i++) {
            if (element.equals(array[i])) {
                System.out.println("Element " + array[i] + " is in " + i + " position");
            }
        }
        System.out.println("List does not contain given element");
    }

    /**
     * This method adds element in array list
     *
     * @param element element whose presence in this collection is to be ensured
     * @return
     */
    @Override
    public boolean add(E element) {
        if (index >= array.length) {
            createNewArray();  //harcnel
        }
        array[index++] = element;
        size++; //harcnel
        return true;
    }

    /**
     * @param o element to be removed from this list, if present
     * @return
     */
    public boolean removeByElement(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(array[i])) { //erb gtnma elementin
                for (int j = i; j < size - 1; j++) { //dranic sksac bolor elementnere 1 hatov dzax en galis
                    array[j] = array[j + 1];
                }
            }
            size--;
        }
        System.out.println("Element is not found");
        return false;
    }

    /**
     * @param index the index of the element to be removed
     * @return
     */
    public E removeByIndex(int index) {
        if (index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        for (int i = index; i < size; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return null;
    }

    /**
     * This method creates new array
     */
    @Override
    public void clear() {
        initialCapacity = 10;
        array = (E[]) new Object[initialCapacity];
        size = 0;
    }

    /**
     * @param index index of the element to return
     * @return
     */
    @Override
    public E get(int index) {
        if (index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return (E) array[index];
    }


}
