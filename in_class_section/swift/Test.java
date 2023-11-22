public class Test {
    //
    // public static Object add(Object first, Object second)
    public static <A> A add(A first, A second) {
        if (first instanceof String &&
            second instanceof String) {
            return ((String)first) + ((String)second);
        } else if (first instanceof Integer &&
                   second instanceof Integer) {
        }
    }

    public static void main(String[] args) {
        add("foo", "bar");
        add(1, 2);
        add(new Object(), new Object());
    }
}
