package lesson2.delegation;

import lombok.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Engine {
    private int power;
    private double volume;

    public void start(){
        System.out.println("bububububutrtrtrbubububu");
    }

}
