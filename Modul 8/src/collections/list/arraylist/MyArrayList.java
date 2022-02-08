package collections.list.arraylist;

import java.util.StringJoiner;

public class MyArrayList<T> {
    private static final int INIT_SIZE = 8;

    private Object[] data;
    private int index;

    public MyArrayList() {

        data = new Object[INIT_SIZE];
    }

    public void add(T value) {
        resizeIfNeed();

        data[index] = value;
        index++;
    }

    public void resizeIfNeed() {
        if (index == data.length) {
            int newSize = data.length * 2;
            Object[] newData = new Object[newSize];
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;
        }
    }

    public T get(int indexValue) {
        if (indexValue == 0) {
            return (T) data[0];
        }
        if (indexValue + 1 > index) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return (T) data[indexValue];

    }

    public int size() {
        return index;
    }

    public void clear() {
        data = new Object[0];
        index = 0;
    }

    public void removeValue(T value) {

        Object[] newData = new Object[data.length - 1];

        for (int i = 0, k = 0; i < data.length - 1; i++, k++) {
            if (!(value.equals(data[i]))) {
                newData[k] = data[i];
            } else {
                newData[k] = data[i + 1];
                i++;
                index--;
            }
        }

        data = newData;
    }

    public void remove(int indexToRemove) {

        int numToCopy = data.length - indexToRemove - 1;
        System.arraycopy(data, indexToRemove + 1, data, indexToRemove, numToCopy);
        data[data.length - 1] = null;
        index--;


    }


    @Override
    public String toString() {
        StringJoiner stringJoiner = new StringJoiner(", ");
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] != null) {
                stringJoiner.add(data[i].toString());
            }
        }


        return "[" + stringJoiner + "]";
    }
}
