package lecture.javaInflearn07.collection;

import java.util.ArrayList;
import java.util.List;

public class Test_forEach {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("taeheoki");
        names.add("catsbi");
        names.add("toby");
        names.add("mijeong");

        names.forEach(System.out::println);

        /* for(String name : names) {
             System.out.println(name);
           }
         */
    }
}
