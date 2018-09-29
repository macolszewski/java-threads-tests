package threads;

import java.util.ArrayList;
import java.util.List;

public class Sprawdzacz extends Thread {
    private List<Thread> threads = new ArrayList<>();

    public Sprawdzacz(List<Thread> threads) {
        this.threads = threads;
    }

    @Override
    public void run() {
        while (true) {
            if (StaticNumbers.number > 50) {
                for (Thread thread : threads) {
                    thread.interrupt();
                }
                break;
            }
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Koniec!");
    }
}

