package lesson2.generic.generic2;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class User<Type> {
    private Type id;
    private String name;


}
