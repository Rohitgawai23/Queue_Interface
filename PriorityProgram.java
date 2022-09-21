package Collection_Queue;

import java.util.PriorityQueue;

public class PriorityProgram {
    public static void main(String[] args) {
        PriorityQueue ob=new PriorityQueue();

        ob.add(1233);
        ob.add(123456);
        ob.add(5678);
        ob.add(466888);

        System.out.println(ob);

        System.out.println(ob.peek());
    }
}
/*
Output :
        [1233, 123456, 5678, 466888]
        1233
 */