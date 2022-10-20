package lecture.javaInflearn07.staticMethods;

public class App {
    public static void main(String[] args) {
        Foo foo = new DefaultFoo();
        foo.hello();

        Foo.helloAll(); // static 메소드 사용
    }
}
