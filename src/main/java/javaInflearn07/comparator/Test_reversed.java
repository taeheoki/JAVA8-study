package javaInflearn07.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test_reversed {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("catsbi");
        names.add("catsbi2");
        names.add("hansol");
        names.add("toby");
        names.add("mijeong");

        Comparator<String> compareToIgnoreCase = String::compareToIgnoreCase;
        names.sort(compareToIgnoreCase.reversed());
        names.forEach(System.out::println);
    }
}
