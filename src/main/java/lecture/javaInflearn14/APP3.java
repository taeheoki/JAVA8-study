package lecture.javaInflearn14;

public class APP3 {
    public static void main(String[] args) throws InterruptedException {
//        Thread thread = new Thread(() -> {
//           try {
//               Thread.sleep(1000L);
//           } catch (InterruptedException e) {
//               e.printStackTrace();
//           }
//
//            System.out.println("Thread " + Thread.currentThread().getName());
//        });
//        Thread thread = new Thread(() -> {
//            while (true) {
//                System.out.println("Thread: " + Thread.currentThread().getName());
//                try {
//                    Thread.sleep(1000L);
//                } catch (InterruptedException e) {
//                    System.out.println("exit!");
//                    return;
//                }
//            }
//        });
        Thread thread = new Thread(() -> {
            System.out.println("Thread : " + Thread.currentThread().getName());
            try {
                Thread.sleep(3000L);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        });
        thread.start();

        System.out.println("Hello " + Thread.currentThread().getName());
//        Thread.sleep(3000L);
//        thread.interrupt(); // 강제로 깨워서 InterruptedException을 발생시킨다.
        thread.join();
        System.out.println(thread + " is finished");
    }
}
