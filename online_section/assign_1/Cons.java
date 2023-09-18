public class Cons implements ImmutableList {
    // ---BEGIN INSTANCE VARIABLES---
    public final int head;
    public final ImmutableList tail;
    // ---END INSTANCE VARIABLES---

    public Cons(final int head, final ImmutableList tail) {
        this.head = head;
        this.tail = tail;
    } // Cons

    //
    // ImmutableList list1 = new Cons(3, new Cons(2, new Cons(1, new Nil())))
    // ImmutableList list2 = new Cons(3, new Cons(2, new Cons(1, new Nil())))
    //
    // list1 == list2: false
    // list1.equals(list2): true
    public boolean equals(final Object other) {
        if (other instanceof Cons) {
            final Cons otherCons = (Cons)other;
            return head == otherCons.head && tail.equals(otherCons.tail);
        } else {
            return false;
        }
    } // equals

    // [3, 2, 1].toString()
    //   Cons(3, Cons(2, Cons(1, Nil)))
    public String toString() {
        return "Cons(" + head + ", " + tail.toString() + ")";
    } // toString

    public int hashCode() {
        return sum();
    } // hashCode

    // ImmutableList list = new Cons(3, new Nil());
    // list.isEmpty(): false
    public boolean isEmpty() {
        return false;
    }

    public static boolean isEmptyStatic(final ImmutableList list) {
        if (list instanceof Nil) {
            return true;
        } else if (list instanceof Cons) {
            return false;
        } else {
            throw new Exception("Unknown object...");
        }
    }

    // [3, 2].addAmount(5) ==>
    // [8, 7]
    // amount: 5
    // head: 3
    // tail: [2].addAmount(8)
    //   [10]
    // newTail: [7]

    // [5, 2, 9].addAmount(1) ==>
    //   [6, 3, 10]
    // amount: 1
    // head: 5
    // tail: [2, 9]
    //
    // newTail: [3, 10]
    
    public ImmutableList addAmount(final int amount) {
        return new Cons(head + amount, tail.addAmount(amount));
        // final ImmutableList newTail = tail.addAmount(amount);
        // return new Cons(head + amount, newTail);
    }


    public int length() {
        return 0;
    }
} // Cons
