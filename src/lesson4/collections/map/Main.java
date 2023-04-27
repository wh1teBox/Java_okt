package lesson4.collections.map;

import lesson4.collections.set.treeset.User;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1,"one"); // перше значення ключ
        map.put(2,"two");

        LinkedHashMap<String, User> map2 = new LinkedHashMap<>();
        map2.put("teamLead", new User(1, "Luke"));
        map2.put("HR", new User(2, "Donna"));

        User Luke = map2.get("teamLead");
        System.out.println(Luke);

//        Map<String, String> form = new LinkedHashMap<>();//ці дані заповнюються автоматично за допомогою фрейморка Spring, він зчитує форму як мапу з ключем і значенням і підставить їх
//        form.put("username", "Oleg");
//        form.put("age", "33");

        //Методи
//        Set<Map.Entry<String, User>> entries = map2.entrySet();
//        entries.forEach(stringUserEntry -> stringUserEntry.getValue());

        Set<String> strings = map2.keySet();// отримати значення ключів
        System.out.println(strings);
        Collection<User> values = map2.values();//отримати колекцію
        System.out.println(values);
        boolean name = map2.containsValue("name");
        System.out.println(name);
        boolean hr = map2.containsKey("HR");
        System.out.println(hr);

        Set<Map.Entry<String, User>> entries = map2.entrySet();
        System.out.println(entries);
        Iterator<Map.Entry<String, User>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, User> next =  iterator.next();//itit будує цикл while з ітератором який викликали з перевіркою hasNext з iterator.next якийбуде пакувати об'єкт в певну комірку
            //oj,
        }

        // застосування stream() в Map
    }

}
