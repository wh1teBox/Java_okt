package lesson2.HW.task3;

import java.util.ArrayList;
import java.util.List;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class User {
    private int id;
    private String name;
    private String surname;
    private String email;
    private int age;
    private Gender gender;
    private List <Skill> skills = new ArrayList<>();
    private Car car;

}
