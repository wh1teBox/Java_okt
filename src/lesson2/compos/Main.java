package lesson2.compos;

public class Main {
    public static void main(String[] args) {
        //агрегація
//        CommonData commonNameSurname = new CommonData("Oleg","Kras");
//        User user = new User(1,commonNameSurname);
//
//        Customer customer = new Customer(commonNameSurname,32,"gfgfg@gkgk.hfjf");
        //композиція
        //уявімо ситуацію що нам потрібно закрити інформацію про те які параметри знаходяться в обєкті,
        //щоб ніхто не зміг їх змінити

        User user = new User(2, "Steven", "King");
        CommonData commonData = user.getCommonData();

    }
}
;