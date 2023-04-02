package lesson3.demo1;

import java.util.List;

public class AscendingArrayPrinter implements ArrayPrinter {

    @Override
    public void print(List<Integer> numbers) {
        for(Integer number : numbers){
            System.out.println(number);
        }

    }
}
