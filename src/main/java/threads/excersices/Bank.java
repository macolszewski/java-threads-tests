package threads.excersices;

public class Bank {
    public static void main(String[] args) {
        final Customer customer = new Customer(100);
        new Thread(new Runnable() {
            @Override
            public void run() {
                customer.withdraw(300);
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                customer.deposite(10);
            }
        }).start();
        for (int i = 0; i<15;i++) {
            customer.deposite(15);
        }


    }
}