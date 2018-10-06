package threads.excersices.newexcercises;

public class IncrementThread extends Thread {
    private Integer integer;

    public IncrementThread(Integer integer) {
        this.integer = integer;
    }

    @Override
    public void run() {
        incrementIntiger();
    }

    synchronized void incrementIntiger() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(getName() + "\t" + integer++);

            try {
                Thread.sleep(2000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
