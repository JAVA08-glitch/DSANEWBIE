package collections;

import java.util.*;


public class DequeDemo {
    static void dequeexample(){
        Deque<Integer> dq= new ArrayDeque<>();
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addLast(3);
        dq.addLast(4);
        System.out.println(dq);
        System.out.println(dq.pollFirst());
        System.out.println(dq.pollLast());
        System.out.println(dq.peekFirst());

    }

    public static void main(String[] args) {
dequeexample();
    }
}
