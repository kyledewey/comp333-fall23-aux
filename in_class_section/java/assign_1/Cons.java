public class Cons implements ImmutableList {
    // ---BEGIN INSTANCE VARIABLES---
    public final int head;
    public final ImmutableList tail;
    // ---END INSTANCE VARIABLES---

    public Cons(final int head, final ImmutableList tail) {
        this.head = head;
        this.tail = tail;
    } // Cons

    public boolean equals(final Object other) {
        if (other instanceof Cons) {
            final Cons otherCons = (Cons)other;
            return head == otherCons.head && tail.equals(otherCons.tail);
        } else {
            return false;
        }
    } // equals
    
    public String toString() {
        return "Cons(" + head + ", " + tail.toString() + ")";
    } // toString

    public int hashCode() {
        return sum();
    } // hashCode

    public boolean isEmpty() {
        return false;
    }    

    // [3, 7, 2].addAmount(4)
    // ==> [7, 11, 6]
    //
    // this: [3, 7, 2]
    // amount: 4
    // head: 3
    // tail: [7, 2]
    //
    // resultHead: 7
    // resultTail: [11, 6]
    // result: [7, 11, 6]
    public ImmutableList addAmount(final int amount) {
        // one-liner
        // return new Cons(amount + head, tail.addAmount(amount));

        final int resultHead = amount + head;
        final ImmutableList resultTail = tail.addAmount(amount);
        final ImmutableList result = new Cons(resultHead, resultTail);
        return result;
    }
} // Cons
