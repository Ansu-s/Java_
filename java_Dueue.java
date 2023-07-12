package com.java.LinkedList;

import java.util.ArrayDeque;

public class java_Dueue {
    public static void main(String[] args) {

        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.offer(45);
        deque.offer(4578);
        deque.offer(76);
        deque.offerFirst(56);
        deque.offer(8);
        deque.offerLast(6);
        deque.offer(4);
        System.out.println(deque);
    }
}
