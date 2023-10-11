import java.util.HashMap;

// Map: maps keys to values; consists of key/value pairs
//
// Contacts list: maps names to phone numbers
//
// Typechecking: map variables to types
// int x = 7;        // { "x" -> int }
// String y = "foo"; // { "x" -> int, "y" -> String }
// String z = y + x; // { "x" -> int, "y" -> String, "z" -> String }

public class Maps {
    public static void main(String[] args) {
        final HashMap<String, String> mapping = new HashMap<String, String>(); // {}
        // in practice: O(1)
        mapping.put("foo", "bar"); // { "foo" -> "bar" }
        mapping.put("moo", "cow"); // { "foo" -> "bar", "moo" -> "cow" }
        mapping.put("foo", "egg"); // { "foo" -> "egg", "moo" -> "cow" }
        mapping.put("egg", "bar"); // { "foo" -> "egg", "moo" -> "cow", "egg" -> "bar" }

        System.out.println(mapping.get("bar") == mapping.get("bar"));
        
        // in practice: O(1)
        System.out.println(mapping.get("foo"));
        System.out.println(mapping.get("moo"));
        System.out.println(mapping.get("egg"));
        System.out.println(mapping.get("jhgsdhfhl"));
    }
}
