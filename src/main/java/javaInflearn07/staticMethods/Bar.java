package javaInflearn07.staticMethods;

public interface Bar {
    default void hello() {
        System.out.println("Bar");
    }
}