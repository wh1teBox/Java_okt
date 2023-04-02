package lesson2.HW.task3;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        User user = new User(1, "Oleg", "Kras", "fgf@jdj.com", 33,Gender.MALE,
                Arrays.asList(new Skill("Java",3),new Skill("JS",1),new Skill("c++",2)),
                new Car("Toyota", 2021,250)


                );

    }
}
