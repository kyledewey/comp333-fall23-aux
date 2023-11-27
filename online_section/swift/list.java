public interface ImmutableList {}
public class Nil implements ImmutableList {
    public Nil() {}
    public String toString() { return "Nil"; }
    public boolean equals(final Object other) {
        return other instanceof Nil;
    }
    public int hashCode() { return 0; }
}
public class Cons implements ImmutableList {
    public final int head;
    public final ImmutableList tail;
    public Cons(final int head,
                final ImmutableList tail) {
        this.head = head;
        this.tail = tail;
    }
    public String toString() {
        return ("cons(" + head + ", " +
                tail.toString() + ")");
    }
    public boolean equals(final Object other) {
        if (other instanceof Cons) {
            final Cons otherCons = (Cons)other;
            return (head == otherCons.head &&
                    tail.equals(otherCons.tail));
        } else {
            return false;
        }
    }
    public int hashCode() {
        return head + tail.hashCode();
    }
}
