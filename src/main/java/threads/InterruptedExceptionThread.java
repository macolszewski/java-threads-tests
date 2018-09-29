package threads;

public class InterruptedExceptionThread extends Thread {

    @Override
    public void run() {
        System.out.println("Start thread");
        try {
            Thread.sleep(5000);
            System.out.println("No viruses detected!");
        } catch (InterruptedException e) {
            System.out.println("Interruption!");
        }
    }
}
