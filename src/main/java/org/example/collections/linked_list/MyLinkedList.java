package org.example.collections.linked_list;

import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;

public class MyLinkedList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable {

    E data;
    private Node head;
    private Node tail;
    private int counter = 0;

    public MyLinkedList() {
        head = null;
        tail = null;
    }

    /**
     * @param index index of the element to return
     * @return
     */
    @Override
    public E get(int index) {
        Node temp = head;
        counter = 0;
        if (index < size() && index >= 0) {
            while (temp != null) {
                if (counter == index) {
                    return (E) temp.data;
                }
                counter++;
                temp = temp.next;
            }
        } else {
            throw new IndexOutOfBoundsException();
        }
        return (E) temp.data;
    }

    /**
     * Checks whether linked list is empty or not
     *
     * @return
     */
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * Adds an element at first element
     * @param data
     */
    public void addFirst(E data) {
        Node temp = new Node(data);
        if (isEmpty()) {
            tail = temp;
        } else {
            head.prev = temp;
        }
        temp.next = head;
        head = temp;
    }

    /**
     * Adds an element at last position
     * @param data
     */
    public void addLast(E data){
        Node temp = new Node(data);
        if (isEmpty()){
            head = temp;
        } else tail.next = temp;

        temp.prev = tail;
        tail = temp;
    }

    public void setter(int index, E data){
        Node temp = head;
        counter = 0;

        while (temp != null && counter != index){
            temp = temp.next;
            counter++;
        }
    }

    /**
     * Returns the size
     *
     * @return
     */
    @Override
    public int size() {
        Node temp = head;
        counter = 0;
        while (temp != null) {
            counter++;
            temp = temp.next;
        }
        return counter;
    }
}
