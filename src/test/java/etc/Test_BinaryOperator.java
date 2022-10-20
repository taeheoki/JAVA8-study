package etc;

import java.util.function.BinaryOperator;

public class Test_BinaryOperator {
    public static void main(String[] args) {
        BinaryOperator<Integer> plus10Combine = (i, j) -> i + j + 10;
        System.out.println(plus10Combine.apply(10, 20));
    }
}
