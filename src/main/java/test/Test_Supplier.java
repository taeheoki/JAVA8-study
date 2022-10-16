package test;

import java.util.function.Supplier;

public class Test_Supplier {
    public static void main(String[] args) {
        Supplier<Integer> get15 = () -> 15;
        System.out.println(get15.get());
        System.out.println(get15);
    }
}
