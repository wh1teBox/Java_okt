package lesson4.collections.set.linkedhash;


import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;


public class Main {
    public static void main(String[] args) {
//        List<Integer> data = List.of(1, 33, 2, 41, 5, 74, 6, 83, 10, 9);
//
//        HashSet<Integer> integerHashSet = new HashSet<>();
//        LinkedHashSet<Integer> integerLinkedHashSet = new LinkedHashSet<>();
//
//        for (int value : data) {
//            integerHashSet.add(value);
//            integerLinkedHashSet.add(value);
//        }
//        System.out.println(integerHashSet); //[1, 33, 2, 83, 5, 6, 41, 9, 74, 10] - послідовність не зберігається
//        System.out.println(integerLinkedHashSet); //[1, 33, 2, 41, 5, 74, 6, 83, 10, 9] - послідовність зберігається

        LinkedHashSet<User> users = new LinkedHashSet<>();
        users.add(new User(1,"Donna"));
        users.add(new User(2,"Paul"));
        users.add(new User(3,"Fiona"));
        users.add(new User(3,"Fiona"));
        users.add(new User(4,"Laima"));
        users.add(new User(5,"Hamish"));
        users.add(new User(5,"Hamish"));
        users.add(new User(6,"Luke"));

        System.out.println(Arrays.asList(users));//
     }
}
