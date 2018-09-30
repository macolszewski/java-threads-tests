package threads.excersices;

public class ActionThread2 extends Thread {
    Table t;

    public ActionThread2(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(100);
    }
}