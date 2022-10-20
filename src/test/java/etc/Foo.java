package etc;

import java.util.function.Function;

public class Foo {
    public static void main(String[] args) {
//        Function<Integer, Integer> plus10 = (i) -> i + 10;
//        System.out.println(plus10.apply(1));//11

        Function<Integer, Integer> plus10 = (i) -> i + 10;
        Function<Integer, Integer> multiply2 = (i) -> i * 2;
        System.out.println(plus10.andThen(multiply2).apply(2));//24
    }
}
