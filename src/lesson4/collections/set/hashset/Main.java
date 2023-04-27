package lesson4.collections.set.hashset;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<User> users = new HashSet<>();
        users.add(new User(1,"Donna"));
        users.add(new User(2,"Paul"));
        users.add(new User(3,"Fiona"));
        users.add(new User(3,"Fiona"));
        users.add(new User(4,"Laima"));
        users.add(new User(5,"Hamish"));
        users.add(new User(5,"Hamish"));
        users.add(new User(6,"Luke"));
    }
}
