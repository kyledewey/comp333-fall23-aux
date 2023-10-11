// - Two states: Locked and Unlocked
// - Unlock, lock, isLocked method on each state
public interface Lock {
    public Lock lock();
    public Lock unlock();
    public boolean isLocked();
}
