package collections.list.queue;

import collections.list.linkedlist.Node;
import collections.list.stack.MyStack;

import java.util.StringJoiner;

public class MyQueue<T> {

    private Node<T> first;
    private Node<T> last;

    private int size;

//    public MyQueue(Node<T> root) {
//        this.root = root;
//    }

    public void add(T value) {
        Node<T> node = new Node<T>(value);
        node.setNext(first);
        first = node;
        size++;
    }

    public void remove(int index) {

        if (index < 0 || index >= getSize()) {
            throw new IndexOutOfBoundsException("Invalid index: " + index + ", Size: " + getSize());
        }
        int i = -1;
        Node<T> cur = first;

        while (cur != null) {
            if (index != 0) {
                if (i == index - 1) {
                    if (cur.prev != null) {
                        cur.prev.next = cur.next;
                    }
                    if (cur.next != null) {
                        cur.next.prev = cur.prev;
                    }
                }
            } else {
                first = first.next;
                break;
            }
            cur = cur.next;
            i++;
        }
        size--;
    }

    public T peek() {
        Node<T> result = first;
        while (result.next != null) {
            result = result.next;
        }
        return result.getValue();
    }

    public T poll() {
        T retValue = this.first.getValue();
        this.first = this.first.getNext();
        size--;
        return retValue;
    }

    public void clear() {
        first = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<T> cur = first;
        try {
            sb.append(cur.getValue() + " -> ");

            while (cur.getNext() != null) {
                sb.append(cur.getNext().getValue() + " -> ");
                cur = cur.getNext();
            }
        } catch (NullPointerException e) {
            //System.out.println("MyQueue is empty");
        }

        return sb.toString();
    }

    static class Node<T> {

        private T value;
        private Node<T> next;
        private Node<T> prev;

        public Node(T value) {
            this.value = value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public T getValue() {
            return value;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

        public Node<T> getNext() {
            return next;
        }
    }
}

