package javaInflearn14;

public class App {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        // Anonymous class
        Thread runnable = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable Thread : " + Thread.currentThread().getName());
            }
        });
        // Lambda Expression
        Thread lambdaThread = new Thread(() -> System.out.println("Lambda Thread : " + Thread.currentThread().getName()));

        runnable.start();
        lambdaThread.start();

        System.out.println("Hello : " + Thread.currentThread().getName());
    }

    // Thread 상속
    private static class MyThread  extends Thread {
        @Override
        public void run() {
            System.out.println("Thread : " + Thread.currentThread().getName());
        }
    }
}
