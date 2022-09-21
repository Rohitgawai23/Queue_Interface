package Collection_Queue;

import java.util.PriorityQueue;

public class PQ_Example {
    public static void main(String[] args) {
        PriorityQueue pq=new PriorityQueue();

        pq.offer(12);
        pq.offer(22);
        pq.offer(67);
        pq.offer(45);
        pq.offer(99);

        System.out.println("original Queue :"+pq);

        System.out.println("Head elemet :"+pq.peek());





    }
}
