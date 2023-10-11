// represents unlocked state
public class Unlocked implements Lock {
    public Lock lock() {
        System.out.println("lock locked");
        return new Locked();
    }
    public Lock unlocked() {
        System.out.println("lock already already unlocked");
        return this;
    }
    public boolean isLocked() {
        return false;
    }
}

