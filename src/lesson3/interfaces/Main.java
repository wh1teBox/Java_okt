package lesson3.interfaces;

public class Main {
    public static void main(String[] args) {
        Singer singer = new User(1, "Oleg");//екземпляр сінгера на базі Юзера

        singer.sing();

        Singer singer2 = new Student("Sam", "fg@df.com");
        singer2.sing();

        Runner runner = new User();
        runner.run(15);
        System.out.println(runner);

        // Calculator calc = (a, b) -> System.out.println(a+b);

        //Calculator calc = Integer::sum; //  цей метод повертає число тому ми можемо звернутись до певного класу integer і до його методу sum - метод референс

        someStuff(10,20, (a,b)-> a+b);
        someStuff(20, 10, (a, b) -> a - b);

    }
    public static int someStuff(int a, int b, Calculator calculator){
        int calc = calculator.calc(a, b);// з calculator ми викликаємо метод calc
        return calc;
    }
}
