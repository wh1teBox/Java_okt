package lesson4.collections.set.treeset;



import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<User> users = new TreeSet<>();
        users.add(new User(1,"Inna"));
        users.add(new User(2,"Charlie"));
        users.add(new User(2,"Charlie"));
        users.add(new User(3,"Fiona"));
        users.add(new User(4,"Laima"));
        users.add(new User(5,"Hamish"));
        users.add(new User(6,"Luke"));
        System.out.println(users);


    }
}
