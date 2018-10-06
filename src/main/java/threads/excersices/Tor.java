package threads.excersices;

public class Tor {
    private Thread train;

    public Thread getTrain() {
        return train;
    }

    public void setTrain(Thread train) {
        this.train = train;
    }

     synchronized public void wjedz(Thread thread) {

        if (isFree()) {
            int time = 60000;
            setTrain(thread);
            System.out.println("Jedzie "+getTrain().getName()+"\t");
            try {
                for (int i=0; i<=time;i+=1000) {
                    if (((time - i) / 1000)%60<10) {
                        System.out.print("\r" + (((time - i) / 1000) / 60) + ":" + "0"+(((time - i) / 1000) % 60) + "s");
                    } else {
                        System.out.print("\r" + (((time - i) / 1000) / 60) + ":" + (((time - i) / 1000) % 60) + "s");
                    }
                    Thread.sleep(1000);
                    setTrain(null);
                }

                System.out.print("\r");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Tor zajęty przez "+getTrain().getName());
        }
    }

    public boolean isFree() {
        if (getTrain()==null) {
            return true;
        } else {
            return false;
        }

    }
}
