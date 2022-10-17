package javaInflearn07.defaultMethods;

public class DefaultFoo implements Foo, Bar {
    private String name;

    @Override
    public void printName() {
        System.out.println("DefaultFoo");
    }

    @Override
    public void hello() {
        System.out.println("DefaultHello");
    }
}
