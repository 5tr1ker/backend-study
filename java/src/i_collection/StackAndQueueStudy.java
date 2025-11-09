package i_collection;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class StackAndQueueStudy {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        System.out.println(stack);

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println(queue);

        Queue<Integer> pq = new PriorityQueue<>();
        pq.offer(4);
        pq.offer(8);
        pq.offer(5);
        pq.offer(12);
        pq.offer(1);

        System.out.println(pq);
        while(!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
     }

}
