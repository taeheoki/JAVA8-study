package etc;

import java.util.function.Predicate;

public class Test_Predicate {
    public static void main(String[] args) {
        Predicate<String> startsWithCatsbi = (s) -> s.startsWith(("catsbi"));
        Predicate<Integer> isOdd = (i) -> i % 2 == 1;
        Predicate<Integer> isEven = (i) -> i % 2 == 0;

        System.out.println(startsWithCatsbi.test("catsbiStudyCode"));
        System.out.println(isOdd.test(3));
        System.out.println(isOdd.test(4));

        System.out.println();

        System.out.println(isOdd.and(isEven).test(4));
        System.out.println(isOdd.or(isEven).test(4));
        System.out.println(isOdd.negate().test(3));
        System.out.println(isEven.negate().test(3));
    }
}
