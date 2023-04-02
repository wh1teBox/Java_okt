package lesson2.HW.task2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PC pc = new PC(new Monitor("ddd","ggg","17"),
                new CPU("i7",Producer.INTEL,4444),
                new Ram(Type.DDR3,"hhhh",18));

        Laptop laptop = new Laptop(
                new Monitor("ccc","ggg","17"),
                new CPU("i7",Producer.INTEL,4444),
                new Ram(Type.DDR3,"hhhh",18),
                new TouchPad("vvv","sss"));

        Ultrabook ultrabook = new Ultrabook(
                new Monitor("ccc","ggg","17"),
                new CPU("i7",Producer.INTEL,4444),
                new Ram(Type.DDR3,"hhhh",18),
                new TouchPad("vvv","sss"),
                1.3
        );

        PC pc1 = pc;
        PC pc2 = laptop;

//        ArrayList<PC> list = new ArrayList<>(){{
//            this.add(laptop);
//            this.add(pc);
//            this.add(ultrabook);
//        }};

        List<PC> list = Arrays.asList(pc,laptop,ultrabook);//спосіб наповнення Array

        System.out.println(list);
    }

}
