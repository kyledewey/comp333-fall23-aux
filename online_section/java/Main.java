public class Main {
    public static void main(String[] args) {
        // won't compile - stream is private
        // Test.stream = null;
        // Test.stream = new FileOutputStream(new File("foo.txt"));
    }
}
