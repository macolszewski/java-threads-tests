package threads.excersices;

public class InterrutedExample extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 10; i++) {
            if (Thread.interrupted()) {
                System.out.println(getName() + " Interrapted");
            } else {
                System.out.println(getName() + " Normal exec");
            }
        }
    }

    public static void main(String[] args) {
        InterrutedExample interrutedExample = new InterrutedExample();
        InterrutedExample interrutedExample1 = new InterrutedExample();

        interrutedExample.start();
        interrutedExample1.start();
        interrutedExample.interrupt();

    }
}

