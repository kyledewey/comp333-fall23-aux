public class LessThan implements Predicate {
    public final int amount;

    public LessThan(final int amount) {
        this.amount = amount;
    }

    public boolean matches(int element) {
        return element < amount;
    }
}
