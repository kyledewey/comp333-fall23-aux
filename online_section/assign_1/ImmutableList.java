public interface ImmutableList {
    // need to implement
    public int length();
    public int sum(); // empty list sum is defined as 0
    public boolean contains(final int value);
    public ImmutableList append(final ImmutableList other);

    // example
    public boolean isEmpty();

    // [3, 2, 1].addAmount(4)
    // ==> [7, 6, 5]
    //
    // [3, 2, 1].addAmount(0)
    // ==> [3, 2, 1]
    public ImmutableList addAmount(final int amount);

    // provided for you
    public String toString();
    public boolean equals(final Object other);
    public int hashCode(); // Hashmap 
} // ImmutableList
