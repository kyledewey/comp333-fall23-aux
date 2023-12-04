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

public class Example {
    public static void checkPattern(Tree tree) {
        if (tree instanceof Internal) {
            Internal asInternal = (Internal)tree;
            if (asInternal.left instanceof Internal &&
                asInternal.right instanceof Internal) {
                Internal leftInternal = (Internal)asInternal.left;
                Internal rightInternal = (Internal)asInternal.right;
                if (leftInternal.value == 1 &&
                    rightInternal.left instanceof Leaf) {
                    Tree first = leftInteral.left;
                    Tree second = leftInternal.right;
                    int value = asInternal.value;
                    int fourth = rightInternal.value;
