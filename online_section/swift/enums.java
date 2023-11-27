public interface DivisionResult {}
public class Success implements DivisionResult {
    public final int value;
    public Success(final int value) {
        this.value = value;
    }
    public String toString() {
        return "Success(" + value + ")";
    }
    public boolean equals(final Object other) {
        if (other instanceof Success) {
            return value == ((Success)other).value;
        } else {
            return false;
        }
    }
    public int hashCode() {
        return value;
    }
}
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
