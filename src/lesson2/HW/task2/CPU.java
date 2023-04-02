package lesson2.HW.task2;
import lombok.*;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class CPU {
    private String model;
    private Producer producer;
    private int clock;

}
