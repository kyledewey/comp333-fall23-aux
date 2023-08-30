import java.io.*;

// Does some computation
// Writes output to the console or to a file
// Takes a command-line argument to figure out where to write to
public class Test {
    // TODO: implement these methods
    // public static boolean doesUserWantConsole(final String[] args) { ... }
    // public static String getDestinationFile(final String[] args) { ... }

    public static String getDestinationFileOrNull(final String[] args) { ... }

    public static FileOutputStream stream = null;
    
    // 1.) Should be a separate method to write output
    // 2.) Files should only be opened once
    public static void writeData(final String destinationFile,
                                 final String data) {
        if (destinationFile == null) {
            System.out.println(data);
        } else {
            try {
                if (stream == null) {
                    final File file = new File(destinationFile);
                    stream = new FileOutputStream(file, true);
                }
                stream.writeln(data);
            } catch (final Exception e) {
                System.out.println("error: " + e.getMessage());
            }
        }
    }
    
    // Takes days
    public static int doComputation(final String destinationFile) {
        // do some work...
        writeData(destinationFile, "still working");

        // do some more work here...
        writeData(destinationFile, "yep, still working");
    }
    
    public static void main(final String[] args) {
        final String destinationFile = getDestinationFileOrNull(args);
        final int result = doComputation(destinationFile);

        writeData(destinationFile, Integer.toString(result));

        if (stream != null) {
            stream.close();
        }
    }
}
