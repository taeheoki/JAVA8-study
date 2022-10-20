package javaInflearn11;

import java.util.NoSuchElementException;
import java.util.Optional;

public class App {
    public static void main(String[] args) {
        Optional<Integer> integer = Optional.ofNullable(10);
        Optional<Object> empty = Optional.empty();

        System.out.println(integer.get());
        integer.ifPresent(System.out::println);
        integer.orElse(testInteger());
        System.out.println(empty.orElseGet(App::testInteger));
        integer.orElseThrow(NoSuchElementException::new);

//        Integer integer1 = testInteger();
//        Runnable testInteger = App::testInteger;
    }
    public static Integer testInteger(){
        System.out.println("create integer test");
        return (int)(Math.random() * 10);
    }
}
