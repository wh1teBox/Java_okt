package lesson1.lists;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList <String> list = new ArrayList<>();

        list.add("name");
        list.add("age");

        ArrayList<String> skillsList = new ArrayList<>();
        skillsList.add("Java");
        skillsList.add("nodeJS");
        User user = new User(4, "Oleg", skillsList);


//        ArrayList<String> currentSkills = user.getSkills();
//        currentSkills.add("mySQL");

      //скорочений запис
        user.getSkills().add("mySQL");

        System.out.println(user);

        System.out.println(list);

        User ghghjj = User.builder()
                .id(2)
                .name("Oleg")
                .build();
        System.out.println(ghghjj);
    }
}
