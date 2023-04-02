package lesson3.functions;

import java.util.*;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {


        Function <Integer,String> function = new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                return Integer.toString(integer);
            }
        };
//Масив Users буде проходити через метод (ф-цію) convert
        List<User> users = Arrays.asList(
                new User("Oleg", "Kras"),
                new User("Olga", "Mizernyk"),
                new User("Luke", "Hazel")
        );
Function <User, Customer> userCustomerFunction = user -> (new Customer((int)(Math.random()*100), user.getName() + " " + user.getSurname()));
        List <Customer> customers = new ArrayList<>();
        for (User user : users) {
            customers.add(userCustomerFunction.apply(user));
        }

//        for (User user : users) { //ітеруємо юзерів
//            customers.add(new Customer((int)Math.random()*1000, user.getName() + " " + user.getSurname())); //для цієї дії існує інтерфейс
//        }
        System.out.println(customers);

//        convert(users, user -> new Customer((int)Math.random(),  user.getName() + " " + user.getSurname()));

    }

//   public static List <Customer> convert (List<User> userList, Function<User,Customer> userCustomerFunction) {
//       List<Customer> customers = new ArrayList<>();
//
//       for (User user : userList) {
//           Customer customer = userCustomerFunction.apply(user);
//           customers.add(customer);
//
//       }
//       return customers;
//   }
}

