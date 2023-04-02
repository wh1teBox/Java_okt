package lesson1.chair;

import java.util.ArrayList;
import java.util.ListResourceBundle;

public class Main {
    public static void main(String[] args) {

        Chair chair1 = Chair.builder()
                .chairLegs(4)
                .color("black")
                .build();

        System.out.println(chair1);
    }
}
