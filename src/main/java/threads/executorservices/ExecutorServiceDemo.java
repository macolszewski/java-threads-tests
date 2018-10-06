package threads.executorservices;

import java.util.concurrent.*;

public class ExecutorServiceDemo {
    public static void main(String[] args) {
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        executorService.submit(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i <= 9; i++) {
//                    try {
//                        System.out.println((i + 1) + "\tT1");
//                        Thread.sleep(1500);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        });
//
//        ExecutorService executorService2 = Executors.newSingleThreadExecutor();
//        executorService2.submit(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i <= 9; i++) {
//                        System.out.println((i + 1) + "\tT2");
//                    try {
//                        Thread.sleep(1500);
//                    } catch (InterruptedException e) {
//                        return;
//                    }
//                }
//            }
//        });
//        executorService.shutdown();
//        executorService2.shutdownNow();

        ExecutorService executorServiceFuture = Executors.newSingleThreadExecutor();
        Future<String> result = executorServiceFuture.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(2000);
                return "Result of callable!";
            }
        });
        System.out.println("This operation is executed immediatley");
        try {
            executorServiceFuture.shutdown();
            System.out.println(result.get());
            System.out.println();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
