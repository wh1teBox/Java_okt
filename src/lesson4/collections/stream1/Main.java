package lesson4.collections.stream1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        users.add(new User(1, "Paul"));
        users.add(new User(2, "Jane"));
        users.add(new User(3, "Luke"));
        users.add(new User(4, "Hamish"));
        users.add(new User(2, "Olga"));
        users.add(new User(1, "Paul"));
        users.add(new User(2, "Jane"));
        users.add(new User(3, "Luke"));
        users.add(new User(4, "Hamish"));
        users.add(new User(2, "Olga"));
        System.out.println(users);
        Optional<String>max = users.stream()
                .distinct()// швидко перебрати об'єкти які дублюються
                .filter(user -> user.getId() > 2) // повертає this
                .sorted((u1, u2) -> u1.getId() - u2.getId())
                .map(user -> user.toString())
                .max((s1, s2) -> s1.compareTo(s2));

//               .collect(Collectors.toList());

        TreeMap<String, User> map = new TreeMap<>();
        map.put("1", new User(1, "Jane"));
        map.put("2", new User(2, "Luke"));
        map.put("3", new User(3, "Paul"));
        map.put("4", new User(4, "Olga"));
        map.put("5", new User(5, "Sofia"));

        System.out.println(map);
        Set<Map.Entry<String, User>> entries = map.entrySet();

        Map<String, User> collect = entries.stream()
                .filter(stringUserEntry -> stringUserEntry.getValue().getId() > 2)
                .collect(Collectors.toMap(
                        stringUserEntry -> stringUserEntry.getKey(),
                        stringUserEntry -> stringUserEntry.getValue()
                ));
        System.out.println(collect);
        //щоб зібрати все в toString:
        // в методі collect можна викликати Collectors.toMap він приймає 2 ф-ції (keyMapper, valueMapper)
        //вони приймають об'єкт типу Entry та об'єкт який будемо повертати
        //в якості ключа буде виступати entries, з неї витягнули key stringUserEntry.getKey() - це ключ нашої мапи
        // беремо ту саму entries і неї витягуємо value stringUserEntry.getValue()
        // висновок: ми взяли map, наповнили його, перетворили в сет, обгорнули в stream, відфільтрували і зібрали назад в map.
        //тип обєкту типу entry те саме що і мапа або сет

    }
}
        //reduce()
//example1
        class GFG {

            // Driver code
            public static void main(String[] args) {
                // creating a list of Strings
                List<String> words = Arrays.asList("GFG", "Geeks", "for",
                        "GeeksQuiz", "GeeksforGeeks");

                // The lambda expression passed to
                // reduce() method takes two Strings
                // and returns the longer String.
                // The result of the reduce() method is
                // an Optional because the list on which
                // reduce() is called may be empty.
                Optional<String> longestString = words.stream()
                        .reduce((word1, word2)
                                -> word1.length() > word2.length()
                                ? word1 : word2);

                // Displaying the longest String
                longestString.ifPresent(System.out::println);

//example2
                String[] array = {"Geeks", "for", "Geeks"};

                // The result of the reduce() method is
                // an Optional because the list on which
                // reduce() is called may be empty.
                Optional<String> String_combine = Arrays.stream(array)
                        .reduce((str1, str2)
                                -> str1 + "-" + str2);

                // Displaying the combined String
                if (String_combine.isPresent()) {
                    System.out.println(String_combine.get());
                }
//output: Geeks-for-Geeks

                //example3
                List<Integer> array1 = Arrays.asList(-2, 0, 4, 6, 8);

                // Finding sum of all elements
                int sum = array1.stream().reduce(0,
                        (element1, element2) -> element1 + element2);

                // Displaying sum of all elements
                System.out.println("The sum of all elements is " + sum);

//example 4
// To get the product of all elements in given range excluding the rightmost element (отримати добуток усіх елементів у заданому діапазоні, за винятком крайнього правого елемента)

                int product = IntStream.range(2, 8)
                        .reduce((num1, num2) -> num1 * num2)
                        .orElse(-1);

                // Displaying the product
                System.out.println("The product is : " + product);
            }
        }




















