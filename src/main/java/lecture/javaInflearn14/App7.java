package lecture.javaInflearn14;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class App7 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        Callable<String> hello = () -> {
            Thread.sleep(2000L);
            return "Hello";
        };

        Callable<String> java = () -> {
            Thread.sleep(3000L);
            return "Java";
        };

        Callable<String> taeheoki = () -> {
            Thread.sleep(1000L);
            return "Taeheoki";
        };

//        List<Future<String>> futures = executorService.invokeAll(Arrays.asList(hello, java, taeheoki));
//        for (Future<String> f : futures) {
//            System.out.println(f.get());
//        }

        String s = executorService.invokeAny(Arrays.asList(hello, java, taeheoki));
        System.out.println(s);

        executorService.shutdown();

    }
}
