package javaInflearn07.collection;

import java.util.ArrayList;
import java.util.List;

public class Test_removeIf {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("taeheoki");
        names.add("catsbi");
        names.add("toby");
        names.add("mijeong");

        names.removeIf(s -> s.startsWith("c"));
        names.forEach(System.out::println);
    }
}
