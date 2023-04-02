package lesson1.human;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> body = new ArrayList<Integer>();
        Human human = new Human();
        body.add(4);
        body.add(1);

        human.setName("Oleg")
                .setAge(33)
                .setBody(body)
                .builder();

        System.out.println(human);
    }
}
