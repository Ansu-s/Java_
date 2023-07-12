package com.java.LinkedList;
import java.util.Stack;
public class stack {
    public static void main(String[] args) {
        Stack<String> mystack = new Stack<>();
        mystack.push("car");
        mystack.push("bike");
        mystack.push("bus");
        mystack.push("boat");
        System.out.println(mystack.peek());
        System.out.println( mystack.search("sdwrwrikee"));
     mystack.pop();
        System.out.println(mystack);
    }
}

