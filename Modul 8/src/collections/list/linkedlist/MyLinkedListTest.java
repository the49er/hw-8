package collections.list.linkedlist;

/** Class {@link MyLinkedList} implements following methods:
 *  - add(Object value) - add an element at the end of the array
 *  - remove(int index) -
 *  - clear() -
 *  - size() -
 *  - get(int index) -
 */

public class MyLinkedListTest {
    public static void main(String[] args) {

        MyLinkedList<Object> list = new MyLinkedList<>();


        list.add("Hello");
        list.add(123);
        list.add(98);
        list.add("Link");
        list.add("Yo");
        System.out.println("list = " + list);
        System.out.println("list.getSize() = " + list.getSize());
        System.out.println("list.getIndex(0) = " + list.getIndex(0));
        System.out.println("list.getIndex(1) = " + list.getIndex(1));
        System.out.println("list.getIndex(2) = " + list.getIndex(2));

        //list.clear();

        System.out.println("list = " + list);
        System.out.println("list.getSize() = " + list.getSize());


        System.out.println("list.getIndex(3) = " + list.getIndex(3));
        list.remove(3);
        System.out.println("list = " + list);
        System.out.println("list.getSize() = " + list.getSize());
        list.clear();
        System.out.println(list);
    }
}