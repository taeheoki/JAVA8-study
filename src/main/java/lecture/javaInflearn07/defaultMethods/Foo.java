package lecture.javaInflearn07.defaultMethods;

public interface Foo {
    void printName();

    default void hello() {
        System.out.println("Foo");
    }
}
