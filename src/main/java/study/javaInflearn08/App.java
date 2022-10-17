package study.javaInflearn08;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("taeheoki");
        names.add("42seoul");

        Stream<String> stringStream = names.stream().map(String::toUpperCase);
        names.forEach(System.out::println);
        System.out.println("=======================");
        stringStream.forEach(System.out::println);
    }
}
