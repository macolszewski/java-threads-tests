package threads.excersices.newexcercises;

public class IncrementRunnable implements Runnable {
    private Integer integer;

    public IncrementRunnable(Integer integer) {
        this.integer = integer;
    }

    @Override
    public void run() {
        incrementIntiger();
    }

    synchronized void incrementIntiger() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Thread-1\t" + integer++);

            try {
                Thread.sleep(2000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
