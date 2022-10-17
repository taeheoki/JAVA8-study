package study.javaInflearn08;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("taeheoki");
        names.add("42seoul");
        names.add("acho");
        names.add("woonchoi");

        Stream<String> stringStream = names.stream().map(s -> {
            System.out.println(s);
            return s.toUpperCase();
        });
        names.forEach(System.out::println);

        System.out.println("=============");
        System.out.println("병렬 처리 표현");

        List<String> collect = names.parallelStream().map(s -> {
            System.out.println(s + " " + Thread.currentThread().getName());
            return s.toUpperCase();
        }).collect(Collectors.toList());

        collect.forEach(System.out::println);
    }
}
