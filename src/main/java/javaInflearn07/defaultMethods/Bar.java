package javaInflearn07.defaultMethods;

public interface Bar {
    default void hello() {
        System.out.println("Bar");
    }
}
