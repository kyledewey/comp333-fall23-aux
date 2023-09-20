public class Nil implements ImmutableList {
    public Nil() {}

    public boolean equals(final Object other) {
        return other instanceof Nil;
    } // equals
    
    public String toString() {
        return "Nil";
    } // toString

    public int hashCode() {
        return 0;
    } // hashCode

    // [].isEmpty()
    // ==> true
    public boolean isEmpty() {
        return true;
    }

    public static boolean isEmptyStatic(final ImmutableList list) {
        if (list instanceof Nil) {
            return true;
        } else if (list instanceof Cons) {
            return false;
        } else {
            // uh oh
            // null.isEmpty()
        }
    }

    // [].addAmount(3)
    // ==> []
    public ImmutableList addAmount(final int amount) {
        // return new Nil();
        return this;
    }
} // Nil
    
