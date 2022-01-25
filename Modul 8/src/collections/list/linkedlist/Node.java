package collections.list.linkedlist;

public class Node<T> {
    T value;
    Node<T> next ;
    Node<T> prev ;


    public Node(T value) {
        this.value = value;


    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getPrev() {
        return prev;
    }

    public void setPrev(Node<T> prev) {
        this.prev = prev;
    }
}
