package lecture.javaInflearn14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App4 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        executorService.execute(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Thread + " Thread.currentThread().getName());
//            }
//        });
        executorService.submit(() -> System.out.println("Thread + " + Thread.currentThread().getName()));

        executorService.shutdownNow();
    }
}
