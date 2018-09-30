package threads.excersices;

public class Train extends Thread {
    private Tor tor;

    public Train(Tor tor) {
        this.tor = tor;
    }

    public void run() {
        tor.wjedz(this);
    }


}
