package etc;

import java.util.function.BiFunction;

public class Test_BiFunction {
    public static void main(String[] args) {
        BiFunction<Integer, String, String> prefixHello = (i, s) -> {
          return "hello" + i.toString() + s;
        };

        System.out.println(prefixHello.apply(10, "taeheoki"));
    }
}
