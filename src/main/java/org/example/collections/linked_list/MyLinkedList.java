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

    /**
     * Sets an element at index
     * @param index
     * @param data
     */
    public void setter(int index, E data){
        Node cur = head;
        counter = 0;

        while (cur != null && counter != index){
            cur = cur.next;
            counter++;
        }

        Node temp = new Node(data);
        cur.prev.next = temp; //harcnel
        temp.prev = cur.prev;
        cur.prev = temp;
        temp.next = cur;

    }

    /**
     * Removes the first element
     */
    public void removeFirst() {
        if(size() == 0)
            throw new NullPointerException();
        else {
            if (head.next == null) {
                tail = null; //harcnel
            }
            else {
                head.next.prev = null;
            }
            head = head.next;
        }
    }

    /**
     * Removes the last element
     */
    public void removeLast(){
        if(size() == 0){
            throw new NullPointerException();
        }
        else {
            if(head.next == null){
                head = null;
            } else {
                tail.prev.next = null;
            }
            tail = tail.prev;
            counter--; //harcnel
        }
    }

    /**
     * Iterates through list and prints its elements
     */
    public void iterate(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("");
    }

    /**
     * Prints linked list in reversed order
     */
    public void reverse(){
        Node temp = tail;
        while(temp != null){
            System.out.println(temp.data + " ");
            temp = temp.prev;
        }
    }

    /**
     * @param element element whose presence in this list is to be tested
     * @return true if is present and false otherwise
     */
    public boolean contains(Object element){
        Node temp = head;
        while (temp != null){
            if (temp.data.equals(element)){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    /**
     * Replaces an element by given index
     * @param index
     * @param element
     */
    public void replace(int index, E element){
        Node temp = head;
         counter = 0;
         while (temp != null){
             if(index == counter){
                 temp.data = element;
                 return;
             }
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

    /**
     * Clears the list
     */
    public void clear(){
        head = null;
        tail = null;
    }

    public void cloneLinkedList(MyLinkedList list){
        list.clear();
        Node temp = head;
        while(temp != null){
            list.addLast(temp.data);
            temp = temp.next;
        }
    }

}
