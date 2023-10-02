public class LessThan implements Predicate {
    public final int amount;

    public LessThen(final int amount) {
        this.amount = amount;
    }

    public boolean matches(int element) {
        return element < amount;
    }
}
