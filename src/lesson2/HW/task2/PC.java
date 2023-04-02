package lesson2.HW.task2;
import lombok.*;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class PC {
    private Monitor monitor;
    private CPU cpu;
    private Ram ram;
}