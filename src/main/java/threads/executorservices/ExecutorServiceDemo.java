package threads.executorservices;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ExecutorServiceDemo {
    public static void main(String[] args) throws TimeoutException, ExecutionException {
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

//        ExecutorService executorServiceFuture = Executors.newSingleThreadExecutor();
//        Future<String> result = executorServiceFuture.submit(new Callable<String>() {
//            @Override
//            public String call() throws Exception {
//                Thread.sleep(2000);
//                return "\u001B[32m"+ "Result of callable!"+"\u001B[0m";
//            }
//        });
//        System.out.println("\u001B[31m"+"This operation is executed immediatley"+"\u001B[0m");
//        try {
//            executorServiceFuture.shutdown();
//            System.out.println(result.get());
//            System.out.println();
//
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }


        ExecutorService executorService3 = Executors.newFixedThreadPool(3);
        List<Callable<String>> callables = new ArrayList<>();
        callables.add(new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(1000);
                return "Callable 1 execution";
            }
        });
        callables.add(new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(2000);
                return "Callable 2 excecution";
            }
        });
        callables.add(new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(3000);
                return "Callable 3 excecution";
            }
        });
        try {

            String result = executorService3.invokeAny(callables);
            System.out.println(result);

            List<Future<String >> futures = executorService3.invokeAll(callables);
            for (Future<String> future : futures) {
                try {
                    System.out.println(future.get());
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
