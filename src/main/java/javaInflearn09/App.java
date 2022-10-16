package javaInflearn09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("taeheoki");
        names.add("whiteship");
        names.add("toby");
        names.add("foo");

//        Stream<String> stringStream = names.stream().map(String::toUpperCase);

        // 정의만 했을 뿐 종료 오퍼레이션이 있기 전까지 실행하지 않는다.
        List<String> collect = names.stream().map((s) -> {
            System.out.println(s);
            return s.toUpperCase();
        }).collect(Collectors.toList());
        collect.forEach(System.out::println);

        System.out.println("====================");

        names.forEach(System.out::println);

        System.out.println("====================");

        for (String name : names) {
            if (name.startsWith("t")) {
                System.out.println(name.toUpperCase());
            }
        }

        System.out.println("====================");

        // 손쉽게 병렬 처리할 수 있다.
        List<String> collect1 = names.parallelStream().map(String::toUpperCase).collect(Collectors.toList());
        collect1.forEach(System.out::println);

        System.out.println("====================");

        List<String> collect2 = names.parallelStream().map((s) -> {
            System.out.println(s + " " + Thread.currentThread().getName());
            return s.toUpperCase();
        }).collect(Collectors.toList());
        collect2.forEach(System.out::println);

        System.out.println("====================");

        names.forEach(System.out::println);
    }

}
