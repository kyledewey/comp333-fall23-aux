public class FileWriter extends Writer {
    private final FileOutputStream stream;

    public FileWriter(final String fileToWriteTo) {
        final File file = new File(fileToWriteTo);
        stream = new FileOutputStream(file);
    }

    public void writeThing(final String thing) {
        stream.writeln(thing);
    }
}

        
