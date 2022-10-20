package lecture.javaInflearn14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class App5 {
    public static void main(String[] args) {
//        ExecutorService executorService = Executors.newFixedThreadPool(2);
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
//        executorService.submit(getRunnable("Hello"));
//        executorService.submit(getRunnable("taeheoki"));
//        executorService.submit(getRunnable("The"));
//        executorService.submit(getRunnable("Java"));
//        executorService.submit(getRunnable("Thread"));
        executorService.schedule(getRunnable("Hello"), 3, TimeUnit.SECONDS);
        executorService.scheduleAtFixedRate(getRunnable("Hello"), 1, 2, TimeUnit.SECONDS);

//        executorService.shutdown();
    }

    private static Runnable getRunnable(String message) {
        return () -> System.out.println(message + " " + Thread.currentThread().getName());
    }
}
