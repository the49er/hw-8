package collections.list.stack;

import collections.list.queue.MyQueue;

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
        T peekStack = null;
        try {
            peekStack = this.first.getValue();
        }catch (NullPointerException ex) {
            ex.getStackTrace();
        }
        return peekStack;
    }

    public T pop () {
        T retValue = null;
        try {
            retValue = this.first.getValue();
            this.first = this.first.next;
            size--;
        }catch (NullPointerException ex){
            ex.getStackTrace();
        }
        return retValue;
    }

    public void clear() {
        first = null;
        size = 0;
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

    public int getSize() {
        return size;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<T> cur = first;
        if (cur != null) {
            sb.append(" <- " + cur.getValue());

            while (cur.getNext() != null) {
                sb.append(" <- " + cur.getNext().getValue());
                cur = cur.getNext();
            }
            return sb.toString();
        }
        return null;
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
