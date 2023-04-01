package org.example.collections.queue_and_dqueue;

import java.util.*;

public class Methods {

    /**
     * 1. Implement a queue using LinkedList and add elements to it.
     */
    public void addElementQueue() {
        Queue queue = new LinkedList();
        queue.add(1);
        queue.add("sd");
        queue.add(33);
    }

    /**
     * 2. Implement a deque using LinkedList and add elements to it.
     */
    public void addElementDequeue(){
        Deque deque = new LinkedList();
        deque.add(2);
        deque.add(3.5);
        deque.add('c');
    }

    /**
     * 3. Create a priority queue of integers and add elements to it.
     */
    public void queueOfIntegers(){
        PriorityQueue<Integer> prQueue = new PriorityQueue<>();
        prQueue.add(6);
        prQueue.add(5);
        prQueue.add(5453);
    }

    /**
     * 4. Create a priority queue of strings and add elements to it.
     */
    public void queueOfStrings(){
        PriorityQueue<String> prQueue = new PriorityQueue<>();
        prQueue.add("aaa");
        prQueue.add("bbb");
        prQueue.add("ccc");
    }

    /**
     * 5. Create a deque using ArrayDeque and add elements to it.
     */
    public void dequeUsingArrayDeque(){
        Deque<String> deque = new ArrayDeque<>();
        deque.add("aaa");
        deque.add("bbb");
        deque.add("ccc");

    }

    /**
     * 6. Create a priority queue of custom objects and add elements to it.
     */
    public void prQueue(){
        PriorityQueue prQueue = new PriorityQueue();
        prQueue.add(56);
        prQueue.add("Sona");
        prQueue.add(3.5);
    }

    /**
     * 7. Remove elements from a queue until it is empty.
     */
    public void removeFromQueue(){
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(2);
        queue.add(6);
        queue.add(3);

        Iterator<Integer> i = queue.iterator();
        while (!queue.isEmpty()){
            queue.poll();
            System.out.println(queue);
        }
    }

    /**
     * 8. Remove elements from a deque until it is empty.
     */
    public void removeFromDeQue(){
        Deque deque = new ArrayDeque();
        deque.add(1);
        deque.add(6);
        deque.add(3);

        while (!deque.isEmpty()){
            deque.poll();
            System.out.println(deque);
        }
    }

    /**
     * 9. Check if an element is present in a queue.
     * @param name
     */
    public void checkQueue(String name){
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("Sona");
        queue.add("Ani");
        if (queue.contains(name)){
            System.out.println("\n" + name + " is present in Queue");
        } else {
            System.out.println("\n" + name + " is not present in the Queue");
        }
    }

    /**
     * 10. Check if an element is present in a deque.
     * @param name
     */
    public void checkDeque(String name){
        Deque<String> queue = new ArrayDeque<String>();
        queue.add("Sona");
        queue.add("Ani");
        if (queue.contains(name)){
            System.out.println("\n" + name + " is present in Deque");
        } else {
            System.out.println("\n" + name + " is not present in the Deque");
        }
    }

    /**
     * 11. Using the Queue<T> class write a program to print  its first 50 members for given N.
     * N = 1,3,5,7,9,…
     */
    public void printAllNumbers(){
        Queue<Integer> queue = new LinkedList<>();
        int counter = 0;
        for (int i = 0; i < 200; i += 2) {
            queue.add(i);
        }
        System.out.print("First 50 numbers of the list: [ ");
        while (counter < 50){
            System.out.println(queue.poll() + " "); //harcnel
            counter++;
        }
        System.out.println("]");
    }

    /**
     * 12. Write a Java program to create a new priority queue,add some colors
     * (string) and print out the elements of the priority queue.
     */
    public void queueOfColors(){
        PriorityQueue<String> colors = new PriorityQueue<>();
        colors.add("white");
        colors.add("green");
        colors.add("blue");

        while(!colors.isEmpty()){
            System.out.println(colors.poll());
        }
    }

    /**
     * 13. Write a Java program to add all the elements of a priority queue to another priority queue.
     */
    public void copyPriorityQueue(){
        PriorityQueue prQueue = new PriorityQueue();
        prQueue.add(3);
        prQueue.add(5);
        prQueue.add(2);

        PriorityQueue prQueue1 = new PriorityQueue();

        while(!prQueue1.isEmpty()){
            System.out.println(prQueue1.poll()); //harcnel
        }
    }

    /**
     * 14. Write a Java program to retrieve and remove the first element.
     */
    public void removeFirstElement(){
        PriorityQueue queue = new PriorityQueue();
        queue.add(5);
        queue.add(3);
        queue.add(9);

        System.out.println("\nList: " + queue);
        queue.poll();
        System.out.println("\nList after removing the first element: " + queue);
    }

    /**
     * 15.	Write a Java program to change priorityQueue to maximum priority queue.
     */
    public void reverseOrder(){
        PriorityQueue<Integer> queue = new PriorityQueue<>(10, Collections.reverseOrder()); //harcnel
        queue.add(8);
        queue.add(10);
        queue.add(4);
        queue.add(3);
        queue.add(9);

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }


}
