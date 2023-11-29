public interface Node {}
// not shown: equals, hashCode, toString
public class Leaf implements Node {}
public class Internal implements Node {
    public final Node left;
    public final int value;
    public final Node right;
    public Internal(final Node left,
                    final int value,
                    final Node right) {
        this.left = left;
        this.value = value;
        this.right = right;
    }
}

public class Example {
    public static void main(String[] args) {
        Node tree1 = ...;
        if (tree1 instanceof Internal) {
            Internal asInternal = (Internal)tree1;
            if (asInternal.left instanceof Leaf &&
                asInternal.right instanceof Leaf) {
                int value = asInternal.value;
                System.out.println(value);
            } else if (asInternal.left instanceof Internal &&
                       asInternal.right instanceof Leaf) {
                Internal innerInternal = (Internal)asInternal.left;
                if (innerInternal.value == 2) {
                    Node first = innerInternal.left;
                    Node second = innerInternal.right;
                    int third = asInternal.value;
                
