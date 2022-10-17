package javaInflearn07.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class Test_spliterator {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("taeheoki");
        names.add("catsbi");
        names.add("toby");
        names.add("mijeong");

        Spliterator<String> spliterator = names.spliterator();
        System.out.println("=========================");
        Spliterator<String> trySplit = spliterator.trySplit();
        while (spliterator.tryAdvance(System.out::println));
        System.out.println("=========================");
        while (trySplit.tryAdvance((System.out::println)));
    }
}
