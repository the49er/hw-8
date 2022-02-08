package map.hashmap;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class MyHashMap<K, V> {
    private int size;
    private int DEFAULT_CAPACITY = 16;
    private MyEntry<K, V>[] values = new MyEntry[DEFAULT_CAPACITY];


    public V get(K key) {
        for (int i = 0; i < size; i++) {
            if (values[i] != null) {
                if (values[i].getKey().equals(key)) {
                    return values[i].getValue();
                }
            }
        }
        return null;
    }

    public void put(K key, V value) {
        boolean insert = true;
        for (int i = 0; i < size; i++) {
            if (values[i].getKey().equals(key)) {
                values[i].setValue(value);
                insert = false;
            }
        }
        if (insert) {
            checkCapacity();
            values[size++] = new MyEntry<K, V>(key, value);
        }
    }

    private void checkCapacity() {
        if (size == values.length) {
            int newSize = values.length * 2;
            values = Arrays.copyOf(values, newSize);
        }
    }

    public int size() {
        return size;
    }

    public void remove(K key) {
        for (int i = 0; i < size; i++) {
            if (values[i].getKey().equals(key)) {
                values[i] = null;
                size--;
                increaseArray(i);
            }
        }
    }

    public void clear() {
        values = new MyEntry[DEFAULT_CAPACITY];
        size = 0;
        return;
    }


    private void increaseArray(int start) {
        for (int i = start; i < size; i++) {
            values[i] = values[i + 1];
        }
    }

 

    @Override
    public String toString() {
        for (int i = 0; i < values.length - 1; i++) {
            while (values[i] != null){
                    System.out.println(values[i].getKey() + ": " + values[i].getValue());
                    break;
           }
        }
        return "";
    }


    public class MyEntry<K, V> {
        private final K key;
        private V value;

        public MyEntry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }
}










