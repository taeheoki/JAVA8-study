package javaInflearn08;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Spliterator;

public class App {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("taeheoki");
        names.add("whiteship");
        names.add("toby");
        names.add("foo");

//        names.forEach(s -> {
//            System.out.println(s);
//        });
//
//        names.forEach(System.out::println);
//
//        for (String n: names) {
//            System.out.println(n);
//        }

//        Spliterator<String> spliterator = names.spliterator();
//        Spliterator<String> spliterator1 = spliterator.trySplit();
//
//        while (spliterator.tryAdvance(System.out::println));
//        System.out.println("==========");
//        while (spliterator1.tryAdvance(System.out::println));

//        names.removeIf(s -> s.startsWith("t"));

//        Comparator<String> compareToIgnoreCase = String::compareToIgnoreCase;
//        names.sort(compareToIgnoreCase.reversed().thenComparing());

        names.forEach(System.out::println);


    }
}