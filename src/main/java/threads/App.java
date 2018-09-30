package threads;

import threads.excersices.CounterRunnable;
import threads.excersices.CounterThread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException {

//        InterruptedExceptionThread interruptedExceptionThread = new InterruptedExceptionThread();
//        interruptedExceptionThread.start();
//        try {
//
//            Thread.sleep(6000);
//            interruptedExceptionThread.interrupt();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

//        Thread t1 = new Counter(50, "T1");
//        Thread t2 = new Counter(50, "T2");
//        Thread t3 = new Counter(50, "T3");
//        Thread t4 = new Counter(50, "T4");
//        List<Thread> threads = new ArrayList<>();
//        threads.add(t1);
//        threads.add(t2);
//        threads.add(t3);
//        threads.add(t4);
//        Thread spawdzacz = new Sprawdzacz(threads);
//        spawdzacz.start();
//
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();

        Thread second = new CounterThread(20);
        Thread first = new Thread(new CounterRunnable(20));

        first.start();
        second.start();
        Thread.sleep(10000);
        second.interrupt();


    }
}
