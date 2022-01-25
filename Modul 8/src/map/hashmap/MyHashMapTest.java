package map.hashmap;

public class MyHashMapTest {

    public static void main(String[] args) {
        MyHashMap<Integer, String> myHashMap = new MyHashMap<>();

        myHashMap.put(1, "Monday");
        myHashMap.put(2, "Tuesday");
        myHashMap.put(3, "Wednesday");

        System.out.println(myHashMap.size());

        System.out.println(myHashMap.get(1));
        System.out.println(myHashMap.get(3));
        myHashMap.remove(3);
        System.out.println(myHashMap.size());

        myHashMap.clear();
        System.out.println(myHashMap.size());

        myHashMap.put(1, "January");
        myHashMap.put(2, "February");
        myHashMap.put(3, "March");
        System.out.println(myHashMap.size());
        System.out.println(myHashMap.get(3));

        System.out.println(myHashMap);
    }
}
