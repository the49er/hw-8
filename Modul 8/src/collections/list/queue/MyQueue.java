package collections.list.queue;

import collections.list.linkedlist.MyLinkedList;
import collections.list.stack.MyStack;

public class MyQueue<T, size> {

    Node<T> first = null;
    Node<T> last = null;
    int size;


    public void add(T value) {
        Node<T> newNode = new Node<>(value);
        if (this.first == null) {
            this.first = newNode;
            this.last = newNode;
        }
        this.last.next = newNode;
        this.last = newNode;

        size++;
    }

    public T remove(int index) {
        if (index < 0 || index >= getSize()) {
            throw new IndexOutOfBoundsException("Invalid index: " + index + ", Size: " + getSize());
        }
        int i = -1;
        Node<T> nodeToRemove = first;
        Node<T> connector = null;

        while (nodeToRemove != null) {
            if(index != 0) {
                i++;
                if (i == index) {
                    if (connector == null) {
                        first = first.next;
                    } else {
                        connector.next = nodeToRemove.next;
                    }
                    size--;
                    return nodeToRemove.getValue();
                }
            }
            connector = nodeToRemove;
            nodeToRemove = nodeToRemove.next;

        }
        return null;
    }

    public T peek() {
        T peekQueue = null;
        try {
            peekQueue = this.first.getValue();
        } catch (NullPointerException ex) {
            ex.getStackTrace();
        }
        return peekQueue;
    }

    public T poll() {
        T pollQueue = null;
        try {
            pollQueue = this.first.getValue();
            this.first = this.first.next;
        }catch (NullPointerException ex) {
            ex.getStackTrace();
        }
        size--;
        return pollQueue;
    }

    public void clear() {
        first = null;
        last = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<T> cur = first;
        if (cur != null) {
            sb.append(cur.getValue() + " <- ");

            while (cur.getNext() != null) {
                sb.append(cur.getNext().getValue() + " <- ");
                cur = cur.getNext();
            }
            return sb.toString();
        }
        return null;
    }


    class Node<T> {

        T value;
        Node<T> next;
        Node<T> prev;

        public Node(T value) {
            this.value = value;
            this.next = null;
            this.prev = null;
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

