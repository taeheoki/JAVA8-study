package test;

import java.util.function.Consumer;

public class Test_Consumer {

    public static void main(String[] args) {
        Consumer<Integer> printT = (i) -> System.out.println(i);
        printT.accept(10);
    }

}
