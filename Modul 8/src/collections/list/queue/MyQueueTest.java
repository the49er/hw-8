package collections.list.queue;


import java.util.LinkedList;
import java.util.Queue;

/** Class {@link MyQueue} implements following methods:
 *  - add(Object value) - Adds an element at the end of the queue
 *  - remove(int index) - Removes the element of the queue by its index.
 *  - clear() - clear the collection
 *  - size() - Returns the size or number of elements in the queue.
 *  - peek() - Returns the head (front) of the queue without removing it. (FIFO)
 *  - poll() - Removes the head of the queue and returns it. If the queue is empty, it returns null
 */

public class MyQueueTest {

    public static void main(String[] args) {

        MyQueue queue = new MyQueue();
        queue.add("first");
        queue.add("second");
        queue.add("third");

        System.out.println(queue.getSize());
        System.out.println(queue);
        queue.add("fourth");

        System.out.println(queue);

        queue.clear();
        System.out.println(queue);
        System.out.println(queue.getSize());

        queue.add("first");
        queue.add("second");
        queue.add("third");
        queue.add("fourth");
        queue.add("five");

        System.out.println(queue);
        System.out.println(queue.getSize());
        System.out.println("queue.peek() = " + queue.peek());

        System.out.println("queue.pop() = " + queue.poll());
        System.out.println(queue);
        System.out.println(queue.getSize());

    }
}