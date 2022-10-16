package test;

public class App {

    public static void main(String[] args) {
        RunSomething runSomething = number -> number + 12;
        System.out.println(runSomething.doIt(1));//11
        System.out.println(runSomething.doIt(1));//11
        System.out.println(runSomething.doIt(1));//11
    }

}
