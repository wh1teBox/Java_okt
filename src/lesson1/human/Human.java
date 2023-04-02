package lesson1.human;

import java.util.ArrayList;

import lesson1.classes.User;
import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Human {
    private String name;
    private int age;
    private ArrayList<Integer> body = new ArrayList<>();

    public Human setName(String name) {
        this.name = name;
        return this;
    }

    public Human setAge(int age) {
        this.age = age;
        return this;
    }

    public Human setBody(ArrayList<Integer> body) {
        this.body = body;
        return this;
    }
}
