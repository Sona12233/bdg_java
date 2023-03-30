package org.example.collections.linked_list;

public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addFirst(1);
        list.addLast(5);
        list.addLast(3);
        list.iterate();
        list.addFirst(22);
        list.iterate();
        list.setter(2, 6);
        list.iterate();
        list.replace(2, 33);
        list.iterate();
    }
}
