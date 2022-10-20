package etc;

import java.util.function.UnaryOperator;

public class Test_UnaryOperator {
    public static void main(String[] args) {
        UnaryOperator<Integer> plus10 = (i) -> i + 10;
        UnaryOperator<Integer> multiply2 = (i) -> i * 2;
        System.out.println(plus10.andThen(multiply2).apply(2));
    }
}
