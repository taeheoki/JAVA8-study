package lecture.javaInflearn14;

import java.util.concurrent.*;

public class App6 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Callable<String> hello = () -> {
          Thread.sleep(2000L);
          return "Hello";
        };

        Future<String> helloFuture = executorService.submit(hello);
        System.out.println(helloFuture.isDone());
        System.out.println("Started!");

//        helloFuture.get(); // 블록킹
        helloFuture.cancel(false); // 작업 종료가 아닌 취소의 의미

        System.out.println(helloFuture.isDone());

//        helloFuture.get(); // 작업을 취소했으면서 값을 왜 가져오라고 하냐?

        System.out.println("End!!");
        executorService.shutdown();
    }
}
