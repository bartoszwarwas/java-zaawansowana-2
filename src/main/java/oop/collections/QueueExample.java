package oop.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Tomek");
        queue.add("Kamil");
        queue.offer("Kamil");
        queue.offer("Tomek");
        System.out.println(queue.peek());
        System.out.println(queue.poll());
    }
}
