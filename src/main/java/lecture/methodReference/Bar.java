package lecture.methodReference;

public interface Bar {

    default void printnamesUpperCase() {
        System.out.println("BAR");
    }

}
