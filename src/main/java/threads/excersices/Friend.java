package threads.excersices;

public class Friend {
    private final String name;

    public Friend(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void bow(Friend bower) {
        System.out.format("%s: %s" + "  has bowed to me!%n", this.name, bower.getName());
        synchronized (bower) {
            bower.bowBack(this);
        }
    }

    public void bowBack(Friend bower) {
        System.out.format("%s: %s" + " has bowed back to me!%n", this.name, bower.getName());
    }
}