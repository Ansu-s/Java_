package com.java.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Priority_Queue {
    public static void main(String[] args) {
       Queue<Integer> mypqueue = new PriorityQueue<>();
       mypqueue.add(5);
       mypqueue.add(57);
       mypqueue.add(326);
       mypqueue.add(45);
       mypqueue.add(86);
        System.out.println(mypqueue);
        System.out.println( mypqueue.poll());
        System.out.println(mypqueue);
        System.out.println(mypqueue.element());
        System.out.println(mypqueue);
    }
}
