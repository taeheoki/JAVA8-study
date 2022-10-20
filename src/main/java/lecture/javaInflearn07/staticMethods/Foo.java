package lecture.javaInflearn07.staticMethods;

public interface Foo {
    void printName();

    default void hello() {
        System.out.println("Foo");
    }
    static void helloAll() {
        System.out.println("인삿말");
    }
}
