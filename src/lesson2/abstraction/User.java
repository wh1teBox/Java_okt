package lesson2.abstraction;
import lombok.*;
@Data
@NoArgsConstructor
@AllArgsConstructor

public abstract class  User {
    private int id;
    private String name;

    public abstract void aaa(String s);//метод не описує ніякої дії, те що повинен робити цей метод потрібно визначити в класі який наслідує User
}
