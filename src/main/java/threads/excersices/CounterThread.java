package threads.excersices;

public class CounterThread extends Thread {
    private int n;

    public CounterThread(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        for (int i=0; i<=n; i++) {

            try {
                if (i%2==0 && i!=0) {
                    System.out.println("TT "+i);
                } else {
                    continue;
                }
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Koniec wątku!");
                return;
            }
        }

    }
}
