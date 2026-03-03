package collections;
import  java.util.*;
public class QueueInerface {
    static void QueueExample(){
//        LinkedList<Integer> q=new LinkedList<>();//queue using linkedlist
//       q.offer(1);
//        q.offer(2);
//        q.offer(3);
//        System.out.println(q.peek());
//        System.out.println(q.poll());
//        System.out.println(q.peek());
//        System.out.println(q.isEmpty());
//        System.out.println(q.size());
      //priorityqueue
//      PriorityQueue<Integer> pq= new PriorityQueue<>();
        PriorityQueue<Integer> pq= new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(10);
      pq.add(5);
      pq.add(7);
        System.out.println(pq.peek());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.peek());
        System.out.println(pq);

    }

    public static void main(String[] args) {
        QueueExample();
    }
}
