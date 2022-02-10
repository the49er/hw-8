package collections.list.stack;

import collections.list.queue.MyQueue;

/** Class {@link MyStack} implements following methods:
 *  - push(Object value) - add an element at the end of the stack
 *  - remove(int index) - Removes the element of the stack by its index.
 *  - clear() - clear the collection
 *  - size() - Returns the size or number of elements in the stack.
 *  - peek() - returns the first element in the queue (LIFO)
 *  - poll() - returns and removes the first element in the stack (LIFO)
 */

public class MyStackTest {
    public static void main(String[] args){
        MyStack stack = new MyStack();

        stack.push("one");
        stack.push("two");
        stack.push("three");
        stack.push("four");
        stack.push("five");
        stack.push("six");
        stack.push("seven");

        System.out.println("stack.getSize() = " + stack.getSize());
        System.out.println("stack = " + stack);
        stack.remove(2);
        stack.remove(4);
        stack.remove(4);

        System.out.println("stack.getSize() = " + stack.getSize());
        System.out.println("stack = " + stack);
        stack.clear();
        System.out.println("stack.getSize() = " + stack.getSize());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.peek() = " + stack.peek());
    }
}
