package collections.list.arraylist;

/** Class {@link MyArrayList} is able to implement following methods:
 * - add() - adds a new element at the end of the array;
 * - remove(int index) - removes an element from the array by its index ;
 * - remove(T value) - removes the first found element from the array by its value;
 * - size() - receives array's length;
 * - clear() - removes all the elements from the array;
 * - get(int index) - returns a value from the array by its index;
 */

public class MyArrayListTest {
    public static void main(String[] args) {

        MyArrayList<Object> myArrayList = new MyArrayList();

        myArrayList.add("hello");
        myArrayList.add(5);
        myArrayList.add(20L);
        myArrayList.add(5);
        myArrayList.add(10);

        System.out.println("myArrayList.get(4) = " + myArrayList.get(4));
        System.out.println(myArrayList);
        System.out.println(myArrayList.size());

        myArrayList.remove(2);
        System.out.println("myArrayList = " + myArrayList);
        System.out.println(myArrayList.size());

        myArrayList.removeValue(5);
        System.out.println("myArrayList = " + myArrayList);
        System.out.println(myArrayList.size());

        myArrayList.removeValue(5);
        System.out.println("myArrayList = " + myArrayList);
        System.out.println(myArrayList.size());

        System.out.println("myArrayList.get(1) = " + myArrayList.get(1));

        myArrayList.removeValue("hello");
        System.out.println("myArrayList = " + myArrayList);
        System.out.println(myArrayList.size());

        System.out.println("myArrayList.get(0) = " + myArrayList.get(0));
        myArrayList.clear();

        System.out.println("myArrayList = " + myArrayList);
        System.out.println(myArrayList.size());
        //System.out.println("myArrayList.get(0) = " + myArrayList.get(0));

    }
}
