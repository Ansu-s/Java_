package com.java.LinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        Queue<Integer> myqueue = new LinkedList<>();
myqueue.offer(5);
myqueue.add(750);
myqueue.add(5);
myqueue.add(65);
        System.out.println(myqueue);
        System.out.println(myqueue.poll());
        System.out.println(myqueue.element());
        System.out.println(myqueue.remove());
        System.out.println(myqueue);




    }
}
