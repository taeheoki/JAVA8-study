package javaInflearn07.defaultMethods;

public interface Foo {
    void printName();
    // 기본 메소드(Default Method)
    /*
     * @ImplSpec
     * 이 구현체는 한국어 인삿말을 출력합니다.
     */
    default void hello() {
        System.out.println("안녕하세요");
    }
    /*
     * @ImplSpec
     * 이 구현체는 getName()으로 가져온 문자열을 대문자로 변환 후 출력한다.
     */
    default void printNameUpperCase() {
        System.out.println(getName().toUpperCase());
    }
    String getName();
}
