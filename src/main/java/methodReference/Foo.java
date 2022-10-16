package methodReference;

public interface Foo {

    void printnames();

    /*
     *@implSpec 이 구현체는 getnames()으로 가져온 문자열을 대문자로 바꿔 출력한다.
     */
    default void printnamesUpperCase() {
        System.out.println(getnames().toUpperCase());
    }

    static void printAnything() {
        System.out.println("Foo");
    }

    String getnames();

}
