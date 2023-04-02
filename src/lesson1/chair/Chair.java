package lesson1.chair;

import java.util.ArrayList;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Chair {
    private int chairLegs;
    private String color;
    private ArrayList<Integer> other;
}
