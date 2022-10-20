package lecture.javaInflearn14;

public class App2 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread: " + Thread.currentThread().getName());
            }
        });
        thread.start();

        System.out.println("Hello " + Thread.currentThread().getName());
    }
}
