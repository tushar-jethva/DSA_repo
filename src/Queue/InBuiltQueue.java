package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class InBuiltQueue {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        System.out.println("Peek "+ queue.peek());

        System.out.println( queue.remove());
        System.out.println( queue.remove());
        System.out.println( queue.remove());
        System.out.println( queue.remove());
    }
}
