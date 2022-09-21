package Collection_Queue;

import java.util.PriorityQueue;

public class pq_methods_remove_ob {
    public static void main(String[] args) {

        PriorityQueue ob=new PriorityQueue();

        ob.offer(1);
        ob.offer(12);
        ob.offer(123);
        ob.offer(1234);
        ob.offer(12345);

        System.out.println(ob);

        System.out.println(ob.remove(123));

        System.out.println(ob);
    }
}
/*
Output :

        [1, 12, 123, 1234, 12345]
        true
        [1, 12, 12345, 1234]

 */