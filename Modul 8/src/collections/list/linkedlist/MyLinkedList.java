package collections.list.linkedlist;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class MyLinkedList<T> {

    /**
     * Methods
     * <p>
     * add(Object value) добавляет элемент в конец
     * remove(int index) удаляет элемент под индексом
     * clear() очищает коллекцию
     * size() возвращает размер коллекции
     * get(int index) возвращает элемент под индексом
     */
    private Node<T> first;
    private Node<T> last;
    private int size;


    public void add(T item) {
        Node<T> node = new Node(item);

        if (first == null) {
            first = node;
            last = node;
            node.prev = null;
            node.next = null;
        } else {
            last.next = node;
            node.prev = last;
            last = node;
        }
        size++;
    }

    public int getSize() {
        return size;
    }

    public void clear() {
        first = null;
        size = 0;
        return;
    }

    public T getIndex(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Invalid index: " + index + ", Size: " + getSize());
        }

        int i = -1;
        Node<T> cur = first;

        while (cur != null) {
            if (i == index - 1) {
                return cur.getValue();
            }
            cur = cur.getNext();
            i++;
        }
        return null;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<T> cur = first;
        try {
            sb.append(cur.getValue() + " -> ");

            while (cur.getNext() != null) {
                sb.append(cur.getNext().getValue() + " -> ");
                cur = cur.getNext();
            }
            sb.append("null");
        } catch (NullPointerException e) {
            //System.out.println("MyLinkedList is empty");
        }

        return sb.toString();
    }
}