package lesson3.demo;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(11, 22, 33, 44);

        //showListInfo(integers,new AscendingArrayPrinter());
        showListInfo(integers,new DescendingArrayPrinter());


    }
//об'єкт showListInfo приймає дані numbers і об'єкт arrayPrinter який має можливість працювати з цими даними
//ArrayPrinter (об'єкт) кастомний клас в майбутньому
    public static void showListInfo (List<Integer> numbers, ArrayPrinter arrayPrinter){
        arrayPrinter.print(numbers);
    }

}

