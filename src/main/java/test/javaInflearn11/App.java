package test.javaInflearn11;

import java.util.Optional;

public class App {
    public static void main(String[] args) {
        Optional<Integer> integer = Optional.of(10);
        Optional<Object> empty = Optional.empty();

        System.out.println(integer.isPresent());
        System.out.println(empty.isPresent());

        System.out.println(integer.isEmpty());
        System.out.println(empty.isEmpty());
    }
}
