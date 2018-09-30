package threads.excersices;

public class Customer {
    private int amount;

    public Customer(int amount) {
        this.amount = amount;
    }

    synchronized void withdraw(int money) {
        System.out.println("Withdraw.....");
        while (!checkMoney(money)) {
            System.out.println("Not enough money! Waiting for transfer!");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Wypłata powiodła się: " + money);
    }

    private boolean checkMoney(int money) {
        return money <= amount;
    }

    synchronized void deposite(int money) {
        System.out.println("Wpłata...");
        amount += money;
        System.out.println("Wpłata powiodła się: " + money);
        notify();
    }
}