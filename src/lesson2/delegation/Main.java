package lesson2.delegation;

public class Main {
    public static void main(String[] args) {

        Car car = new Car(2, "mazda",new Engine(250,3.5));

        //car.getEngine().start();
        car.start();
    }
}
