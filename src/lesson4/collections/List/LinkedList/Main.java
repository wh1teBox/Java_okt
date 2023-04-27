package lesson4.collections.List.LinkedList;



import java.util.LinkedList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        LinkedList<User> users = new LinkedList<>();
        users.add(new User(1,"Paul"));
        users.add(new User(2,"Donna"));
        users.add(new User(3,"Fiona"));
        users.add(new User(4,"Laima"));
        users.add(new User(5,"Hamish"));
        users.add(new User(6,"Luke"));

        //у LinkedList немає індексів, індексація відбувається в процесі ітерації
        // використовується для модифікації колекції

    }
}
