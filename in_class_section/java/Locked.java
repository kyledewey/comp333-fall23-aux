// represents locked state
public class Locked implements Lock {
    public Lock lock() {
        return this;
    }
    public Lock unlocked() {
        return new Unlocked();
    }
    public boolean isLocked() {
        return true;
    }
}
