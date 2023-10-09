import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        final HashMap<String, String> mapping = new HashMap<String, String>();
        // In practice: O(10)
        mapping.put("foo", "bar");
        mapping.put("alpha", "beta");

        // In practice: O(10)
        System.out.println(mapping.get("foo"));
        System.out.println(mapping.get("alpha"));
        System.out.println(mapping.get("apple"));
    }
}
