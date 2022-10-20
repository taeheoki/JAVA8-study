package lecture.methodReference;

public class Greeting {

    private String names;

    public Greeting() {
    }

    public Greeting(String names) {
        this.names = names;
    }

    public String hello(String names) {
        return "hello " + names;
    }

    static public String hi(String names) {
        return "hi " + names;
    }

    public String getnames() {
        return names;
    }

    public void setnames(String names) {
        this.names = names;
    }
}
