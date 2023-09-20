public class FileWriter extends Writer {
    private final FileOutputStream stream;

    public FileWriter(final String destinationFile) {
        final File file = new File(destinationFile);
        stream = new FileOutputStream(file, true);
    }

    public void writeData(final String data) {
        try {
            stream.writeln(data);
        } catch (final Exception e) {
            System.out.println("error: " + e.getMessage());
        }
    }

    public void close() {
        stream.close();
    }
}
