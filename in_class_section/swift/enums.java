public interface DivisionResult {}
public class DivideByZero implements DivisionResult {
    public DivideByZero() {}
    public String toString() {
        return "DivideByZero";
    }
    public int hashCode() {
        return 0;
    }
    public boolean equals(final Object other) {
        return other instanceof DivideByZero;
    }
}
public class DivisionSuccess implements DivisionResult {
    public final int value;
    public DivisionSuccess(final int value) {
        this.value = value;
    }
    public int hashCode() {
        return value;
    }
    public String toString() {
        return "DivisionSuccess(" + value + ")";
    }
    public boolean equals(final Object other) {
        if (other instanceof DivisionSuccess) {
            return value == ((DivisionSuccess)other).value;
        } else {
            return false;
        }
    }
}
