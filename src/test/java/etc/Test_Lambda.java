package etc;

import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Test_Lambda {
    public static void main(String[] args) {
        Supplier<Integer> get10 = () -> 10;
        Supplier<Integer> get20 = () -> {
          return 20;
        };
        UnaryOperator<Integer> plus10 = i -> i + 10;
        UnaryOperator<Integer> plus20 = (i) -> i + 20;
        BinaryOperator<Integer> plus30 = (i, j) -> i + j + 30;
        BinaryOperator<Integer> plus40 = (Integer i, Integer j) -> i + j + 40;
    }
}
