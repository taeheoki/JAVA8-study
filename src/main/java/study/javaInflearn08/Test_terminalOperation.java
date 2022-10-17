package study.javaInflearn08;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test_terminalOperation {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("taeheoki");
        names.add("42seoul");
        names.add("acho");
        names.add("woonchoi");

        List<String> collect = names.stream().map(s -> {
            System.out.println(s);
            return s.toUpperCase();
        }).collect(Collectors.toList());
        collect.forEach(System.out::println);
    }
}
