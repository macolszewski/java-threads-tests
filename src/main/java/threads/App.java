package threads;

import threads.excersices.*;
import threads.excersices.newexcercises.IncrementRunnable;
import threads.excersices.newexcercises.IncrementThread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App {
    public static void main(String[] args) throws InterruptedException {

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

//        ___________________________________________________

//        Thread second = new CounterThread(20);
//        Thread first = new Thread(new CounterRunnable(20));
//
//        first.start();
//        second.start();
//        Thread.sleep(10000);
//        second.interrupt();

//        Table obj = new Table();
//        //only one object
//        ActionThread1 t1 = new ActionThread1(obj);
//        ActionThread2 t2 = new ActionThread2(obj);
//        t1.start();
//        t2.start();

//        Tor tor = new Tor();
//
//        Train trainPKP = new Train(tor);
//        trainPKP.setName("Pociąg osobowy");
//        Train trainCargo = new Train(tor);
//        trainCargo.setName("Pociąg towarowy");
//
//        trainCargo.start();
//        trainPKP.start();

        Integer integer = new Integer(10);

        Thread incrementThread = new IncrementThread(integer);
        Thread incrementRunnable = new Thread(new IncrementRunnable(integer));


        incrementThread.start();
        incrementRunnable.start();


    }
}
