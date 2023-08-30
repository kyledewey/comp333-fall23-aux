public class Writer {
    private final boolean wantsTerminal;
    private final String fileToWriteTo;    
    private final FileOutputStream stream;

    public Writer(final boolean wantsTerminal,
                  final String fileToWriteTo) {
        if (!wantsTerminal) {
            final File file = new File(fileToWriteTo);
            stream = new FileOutputStream(file);
        } else {
            stream = null;
        }
    }
    
    public void writeThing(final String thing) {
        if (stream == null) {
            System.out.println(thing);
        } else {
            stream.writeln(thing);
        }
    }

    public void close() {
        if (stream != null) {
            stream.close();
        }
    }
}
