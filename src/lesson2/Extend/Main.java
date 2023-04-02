package lesson2.Extend;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(1,"oleg","kras","hfhf@hfhf.com");
        customer.greeting();
        System.out.println(customer);

        ArrayList<User> users = new ArrayList<>();
        users.add(new User());
        users.add(new Customer());

        User user1 = users.get(0);
        User user2 = users.get(1);

        Customer cust = (Customer) user2;//жорстке приведення

        User user = new Customer(1,"Olga", "Miz","df@df.com");

        Admin admin = new Admin();
        users.add(admin);


    }

}
