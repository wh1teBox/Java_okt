package lesson2.enums;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class User {
    private int id;
    private String name;
    private Gender gender;
}
