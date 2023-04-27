package lesson4.collections.map;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "Three");
        treeMap.put(1, "one");
        treeMap.put(4, "Four");
        treeMap.put(2, "two");

        System.out.println("Print treeMap" + treeMap);

        //отримання значення по ключу
        String value = treeMap.get(2);
        System.out.println("Значення по ключу 2 " + value);

        //видалення ел-та по ключу
        treeMap.remove(3);

        //перевірка наявності ключа
        boolean containsKey = treeMap.containsKey(4);

        //ітерація по treeMap
        System.out.println("Ітерація treeMap");
        for(Integer key : treeMap.keySet()){
            String val = treeMap.get(key);
            System.out.println("Key: " + key + " value: " + val);
        }
    }
}
