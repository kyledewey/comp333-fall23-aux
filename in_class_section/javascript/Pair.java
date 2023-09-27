public class Pair<A, B> {
    public final A first;
    public final B second;

    public Pair(final A first, final B second) {
        this.first = first;
        this.second = second;
    }

    public static Pair<Integer, Integer> makePair(final int x, final int y) {
        // return new Pair<Integer, Integer>(Integer.valueOf(x),
        //                                   Integer.valueOf(y));
        return new Pair<>(Integer.valueOf(x), Integer.valueOf(y));
    }
}
