public class TerminalWriter extends Writer {
    public TerminalWriter() {}

    public void writeThing(final String thing) {
        System.out.println(thing);
    }
}
