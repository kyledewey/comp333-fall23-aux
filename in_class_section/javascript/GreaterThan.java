public class GreaterThan implements Predicate {
    public final int value;

    public GreaterThan(final int value) {
        this.value = value;
    }

    public boolean matches(int element) {
        return element > value;
    }
}
