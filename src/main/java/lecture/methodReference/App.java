package lecture.methodReference;

public class App {
    static public void main(String[] args) {
        Foo foo = new DefaultFoo("taeheoki");
        foo.printnames();
        foo.printnamesUpperCase();

        Foo.printAnything();
    }
}
