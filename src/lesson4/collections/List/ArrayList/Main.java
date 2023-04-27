package lesson4.collections.List.ArrayList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
//        ArrayList<String> strings = new ArrayList<>();
//        strings.add("oleg");
//        strings.add("donna");
//        strings.add("laima");
//        strings.add("hamish");
//        strings.add("olga");
//        strings.add("luke");
//        //methods
//        strings.add(1,"paul");//додає ел-т, тобто ел-т з індексом 1 буде тепер з індексом 2, не реплейс
//        System.out.println(strings);
//
//        strings.remove("olga");// видалення ел-та за назвою
//        strings.remove(0);// видалення ел-та за індексом
//
////   strings.sort(new Comparator<String>() {
////       @Override
////       public int compare(String o1, String o2) {
////           return 0;
////       }
////       -->
//        strings.sort((s1, s2) -> s1.compareTo(s2));
//        strings.forEach(s -> System.out.println(s));
//        System.out.println(strings.contains("donna"));// перевіряє чи є елемент в колекції, повертає true/false
//        strings.size(); // повертає розмір колекції
//        ArrayList<String> strings1 = new ArrayList<>();
//        strings.addAll(strings1);// додає нову колекцію до тої що існує
//        strings.removeAll(strings1); //видаляє повністю колекцію strings1
        List<User> users = new ArrayList<>();
        users.add(new User(1,"Paul"));
        users.add(new User(2,"Donna"));
        users.add(new User(3,"Fiona"));
        users.add(new User(4,"Laima"));
        users.add(new User(5,"Hamish"));
        users.add(new User(6,"Luke"));

//        users.forEach(user -> System.out.println(user));
//видалити ел-т зі списку і перейти до наступного
//використовували метод Iterator, але він видає помилку коли масив доходить до кінця
// iterator це внутрішній об'єкт який має посилання на колекцію (наглядач)
        Iterator <User> iterator;
//        iterator = users.iterator();
//        while (iterator.hasNext()) {
//            User next = iterator.next();
//            if (next.getId() == 2){
//                iterator.remove();
//            }
//це можна замінити на
        users.removeIf(user -> user.getName().length()>5);

            System.out.println(users);

        }
    }

