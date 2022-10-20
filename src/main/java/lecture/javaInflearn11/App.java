package lecture.javaInflearn11;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class App {

    public static void main(String[] args) {
        List<OnlineClass> springClasses = new ArrayList<>();
        springClasses.add(new OnlineClass(1, "spring boot", true));
        springClasses.add(new OnlineClass(5, "rest api development", false));

        Optional<OnlineClass> optional = springClasses.stream()
                .filter(oc -> oc.getTitle().startsWith("rest"))
                .findFirst();

        Optional<Integer> integer = optional.map(OnlineClass::getId);
        System.out.println(integer.isPresent());
        if (integer.isPresent())
            System.out.println(integer);
    }

    private static OnlineClass createNewClass() {
        return new OnlineClass(10, "New Class", false);
    }

}
