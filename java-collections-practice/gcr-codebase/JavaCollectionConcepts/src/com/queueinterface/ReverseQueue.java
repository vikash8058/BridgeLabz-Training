package com.queueinterface;
import java.util.*;

public class ReverseQueue {

    public static Queue<Integer> reverse(Queue<Integer> q) {

        Stack<Integer> stack = new Stack<>();

        while (!q.isEmpty()) {
            stack.push(q.remove());
        }

        while (!stack.isEmpty()) {
            q.add(stack.pop());
        }

        return q;
    }

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println(reverse(q));
    }
}
