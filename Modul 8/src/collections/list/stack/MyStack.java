package collections.list.stack;

import collections.list.linkedlist.Node;
import collections.list.queue.MyQueue;

import javax.lang.model.type.MirroredTypeException;

public class MyStack<T> {

    private int size;
    private Node<T> first;
    private Node<T> last;

    public MyStack(){
        this.first = null;
    }


    public void push(T value) {
        Node<T> newNode = new Node<>(value);

        if (first == null) {
            first = newNode;
            last = newNode;
            newNode.prev = null;
            newNode.next = null;
        } else {
              Node<T> tmp = first;
              first = newNode;
              first.next = tmp;





//            last.next = newNode;
//            newNode.prev = last;
//            last = newNode;
        }
        size++;
    }

    public T peek() {
        return this.first.getValue();
    }

    public T pop () {
        T retValue = this.first.getValue();
        this.first = this.first.getNext();
        size--;
        return retValue;
    }

    public void clear() {
        first = null;
        size = 0;
    }

    public void remove(int index) {

        if (index < 0 || index >= getSize()) {
            throw new IndexOutOfBoundsException("Invalid index: " + index + ", Size: " + getSize());
        }
        int i = -1;
        Node<T> cur = first;

        while (cur != null) {
            if(index != 0) {

                if (i == index - 1) {
                    if (cur.prev != null) {
                        cur.prev.next = cur.next;
                    }
                    if (cur.next != null) {
                        cur.next.prev = cur.prev;
                    }
                }
            }else{
                first = first.next;
                break;
            }
            cur = cur.next;
            i++;
        }
        size--;
    }

    public int getSize() {
        return size;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<T> cur = first;
        try {
            sb.append(" <- " + cur.getValue());

            while (cur.getNext() != null) {
                sb.append(" <- " + cur.getNext().getValue());
                cur = cur.getNext();
            }
        } catch (NullPointerException e) {
            //System.out.println("MyQueue is empty");
        }

        return sb.toString();
    }

    static class Node<T> {
        T element;
        Node<T> next;
        Node<T> prev;

        public Node(T element) {
            this.element = element;
        }



        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

        public T getValue() {
            return this.element;
        }

        public T getElement() {
            return element;
        }

        public Node<T> getPrev() {
            return prev;
        }

        public void setPrev(Node<T> prev) {
            this.prev = prev;
        }
    }


}
