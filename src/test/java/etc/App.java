package etc;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class App {

    public static void main(String[] args) {
//        Greeting greeting = new Greeting();
//        UnaryOperator<String> hello = greeting::hello;
//
//        UnaryOperator<String> hi = Greeting::hi;
//
//        System.out.println(hello.apply("taeheoki"));
//        System.out.println(hi.apply("taeheoki"));
//        Supplier<Greeting> newGreeting = Greeting::new;
//
//        Function<String, Greeting> taeheokiGreeting = Greeting::new;
//        Greeting taeheoki = taeheokiGreeting.apply("taeheoki");
//        System.out.println(taeheoki.getNames());

        String[] names = {"taeheoki", "catsbi", "hansol"};
        // 기존의 익명클래스를 이용한 방법
        Arrays.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });

        // 람다 표현식
        Arrays.sort(names, (o1, o2) -> 0);

        // 메소드 레퍼런스를 이용한 방법
        Arrays.sort(names, String::compareToIgnoreCase);

        System.out.println(Arrays.toString(names));; // [catsbi, hansol, taeheoki]
    }

}
