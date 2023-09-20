public interface ImmutableList {
    // you need to implement
    public int length();
    public int sum(); // empty list sum is defined as 0
    public ImmutableList append(final ImmutableList other);
    public boolean contains(final int value);

    // examples
    public boolean isEmpty();

    // [3, 8, 4].addAmount(1)
    // ==> [4, 9, 5]
    //
    // [7, 2, 1].addAmount(3)
    // ==> [10, 5, 4]
    public ImmutableList addAmount(final int amount);
    
    // implemented for you
    public String toString();
    public boolean equals(final Object other);
    public int hashCode();
} // ImmutableList
