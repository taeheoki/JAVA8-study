package test.etc;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class VariableCapture {

    private void run() {
        int baseNumber = 10; //effective final variable
        //final int baseNumber = 10; //Java 8 부터 final 생략 가능

        //로컬 클래스
        class LocalClass {
            void printBaseNumber(){
//                baseNumber = 12;
                System.out.println(baseNumber);
            }
        }

        //익명 클래스
        Consumer<Integer> integerConsumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(baseNumber);
            }
        };

        //람다
        IntConsumer printInt = (i) -> System.out.println(i + baseNumber);
        printInt.accept(10);

    }

}
