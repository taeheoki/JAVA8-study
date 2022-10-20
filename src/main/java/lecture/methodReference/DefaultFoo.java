package lecture.methodReference;

public class DefaultFoo implements Foo {

    String names;

    public DefaultFoo(String names) {
        this.names = names;
    }

    @Override
    public void printnames() {
        System.out.println(this.names);
    }

    @Override
    public String getnames() {
        return this.names;
    }
}
