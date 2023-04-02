package lesson3.demo;

import java.util.List;

public class AscendingArrayPrinter extends ArrayPrinter {
    @Override
    public void print(List<Integer> numbers) {
        for(Integer number : numbers){
            System.out.println(number);
        }



    }
}
// тобто в екземпляр в метод showListInfo може приходити екземпляр arrayPrinter або його нащадок
// якщо клас і метод в ньому є абстрактними ми маємо при наслідуванні передати ці методи в новий клас (нащадку )
//в Main передаємо в якості аргументу новий об'єкт класу AscendingArrayPrinter який буде приймати параметри