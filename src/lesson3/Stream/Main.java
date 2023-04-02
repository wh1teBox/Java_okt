package lesson3.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import static java.util.Arrays.stream;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(2, "Jane"));
        users.add(new User(1, "Alex"));
        users.add(new User(1, "Alex"));
        users.add(new User(3, "Charlie"));
        users.add(new User(3, "Charlie"));
        users.add(new User(5, "Luke"));
        users.add(new User(4, "Oleg"));
        users.add(new User(6, "Paul"));
        users.add(new User(6, "Paul"));

        // users.forEach(user -> System.out.println(user));
        users.stream()
                .sorted((user1, user2) -> user1.getId() - user2.getId())
   //             .filter(user -> user.getName().length()<5)
                .map(user -> user.getId() + ":" + user.getName())

                .forEach(user -> System.out.println(user));
    }
}