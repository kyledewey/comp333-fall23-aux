public class TerminalWriter extends Writer {
    public TerminalWriter() {}

    public void writeData(final String data) {
        System.out.println(data);
    }
}
