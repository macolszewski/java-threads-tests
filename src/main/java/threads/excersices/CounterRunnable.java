package threads.excersices;

public class CounterRunnable implements Runnable {
    private int n;

    public CounterRunnable(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        for (int i=0; i<=n; i++) {

            try {
                if (i%2==0 && i!=0) {
                    System.out.println("TR "+i);
                } else {
                    continue;
                }
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                System.out.println("Koniec wątku!");
                return;
            }
        }

    }

}
