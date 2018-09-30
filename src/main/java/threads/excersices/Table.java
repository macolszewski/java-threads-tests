package threads.excersices;

public class Table {
     void printTable(int n) {
        // not synchronized
        System.out.println("JA");
//        synchronized
        synchronized (this) {
            for (int i = 1; i <= 5; i++) {
                System.out.println(n * (i * 2));
                try {
                    Thread.sleep(300);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
}