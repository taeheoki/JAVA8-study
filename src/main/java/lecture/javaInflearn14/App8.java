package lecture.javaInflearn14;

import java.util.concurrent.*;

public class App8 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        CompletableFuture<Object> future = new CompletableFuture<>();
//        future.complete("taeheoki");
//
//        System.out.println(future.get());

//        CompletableFuture<Object> future = CompletableFuture.completedFuture("taeheoki");
//        System.out.println(future.get());

        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            System.out.println("Hello " + Thread.currentThread().getName());
        }); // 리턴 타입이 없는 경우

        future.get();

        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
            System.out.println("Hello " + Thread.currentThread().getName());
            return "Hello";
        }).thenApply((s) -> {
            System.out.println(Thread.currentThread().getName());
            return s.toUpperCase();
        }); // 리턴 타입이 있는 경우

        future1.get();
        System.out.println("future1 : " + future1.get());

        CompletableFuture<Void> future2 = CompletableFuture.supplyAsync(() -> {
            System.out.println("Hello " + Thread.currentThread().getName());
            return "Hello";
        }).thenAccept((s) -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println(s.toUpperCase());
        });

        future2.get();

        CompletableFuture<Void> future3 = CompletableFuture.supplyAsync(() -> {
            System.out.println("Hello " + Thread.currentThread().getName());
            return "Hello";
        }).thenRun(() -> {
            System.out.println(Thread.currentThread().getName());
        });

        future3.get();

        ExecutorService executorService = Executors.newFixedThreadPool(4);
        CompletableFuture<Void> future4 = CompletableFuture.supplyAsync(() -> {
            System.out.println("Hello " + Thread.currentThread().getName());
            return "Hello";
        }, executorService).thenRunAsync(() -> {
            System.out.println(Thread.currentThread().getName());
        }, executorService);

        future4.get();

        executorService.shutdown();
    }
}
