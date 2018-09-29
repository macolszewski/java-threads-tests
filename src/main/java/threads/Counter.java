package threads;

import java.util.Random;

public class Counter extends Thread {
    private int cycle = 1;
    private final int maxNumber;
    private final String threadName;

    public Counter(int maxNumber, String threadName) {
        this.maxNumber = maxNumber;
        this.threadName = threadName;
    }

    public int getCycle() {
        return cycle;
    }

    @Override
    public void run() {
        for (int i = 1; i < maxNumber; i++) {
            if (this.isInterrupted()) {
                return;
            } else {
                System.out.println(threadName + "\t-> " + StaticNumbers.number++ + "\t cykl:" + cycle++);

                try {
                    Thread.sleep(new Random().nextInt(2000));
                } catch (InterruptedException e) {
                    return;
                }
            }

        }

    }
}
