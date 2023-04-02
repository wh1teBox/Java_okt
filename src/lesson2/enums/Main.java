package lesson2.enums;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        User user = new User(1,"Oleg", Gender.FEMALE);

        Gender gender = user.getGender();

        if (gender.isWomen()){
            System.out.println("true");
        }

        if (gender.equals(Gender.FEMALE)){
            System.out.println("true");
        }

        Gender[] values = Gender.values();
        System.out.println(Arrays.toString(values));

    }
}
