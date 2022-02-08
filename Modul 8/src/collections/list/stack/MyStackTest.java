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

        stack.push("Winter");
        stack.push(123);
        stack.push("Summer");
        stack.push(32123);

        System.out.println("stack = " + stack);
        System.out.println("stack.getSize() = " + stack.getSize());


        System.out.println("stack.peek() = " + stack.peek());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.getSize() = " + stack.getSize());
        System.out.println("stack = " + stack);
        stack.push("Top");
        stack.push("New Top");
        System.out.println("stack = " + stack);



        stack.clear();
        System.out.println(stack.pop());
        System.out.println(stack.peek());

        stack.push("Top");
        stack.push("New Top");

        System.out.println(stack.pop());
        System.out.println(stack.peek());

        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());



    }
}
