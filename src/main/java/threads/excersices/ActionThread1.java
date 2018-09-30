package threads.excersices;

public class ActionThread1 extends Thread {
    Table t;

    public ActionThread1(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5);
    }

}