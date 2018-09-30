package threads.excersices;

public class Table {
   synchronized void printTable(int n) {
        //method not synchronized
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