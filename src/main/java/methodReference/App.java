package methodReference;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class App {
    static public void main(String[] args) {
        Foo foo = new DefaultFoo("taeheoki");
        foo.printnames();
        foo.printnamesUpperCase();

        Foo.printAnything();
    }
}
