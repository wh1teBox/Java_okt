package lesson1.classes;

public class Main {
    public static void main(String[] args) {
      User user=   new User();

      User user1 = new User(4,"Oleg", false, new String[]{});

        user.getName();
        user1.setName("Luke");

        System.out.println(user1);

        Car car = new Car(4,"Mazda");

        car.setModel("Nissan");

        System.out.println(car.getModel());
    }
}
