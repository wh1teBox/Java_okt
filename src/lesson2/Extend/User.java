package lesson2.Extend;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class User {
    private int id;
    private String name;
    private String surname;

    public void greeting(){
        System.out.println("Hello");
    }

}
