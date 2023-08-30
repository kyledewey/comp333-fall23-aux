import java.io.*;

// Does some computation
// Writes output to the console or to a file
// Takes a command-line argument to figure out where to write to
public class Test {
    // TODO: implement these methods
    // public static boolean doesUserWantConsole(final String[] args) { ... }
    // public static String getDestinationFile(final String[] args) { ... }

    public static String getDestinationFileOrNull(final String[] args) { ... }
    
    public static int doComputation() { ... }
    
    public static void main(final String[] args) {
        final String destinationFile = getDestinationFileOrNull(args);
        final int result = doComputation();

        if (destinationFile == null) {
            System.out.println(result);
        } else {
            try {
                final File file = new File(destinationFile);
                final FileOutputStream stream = new FileOutputStream(file);
                stream.writeln(result);
                stream.close();
            } catch (final Exception e) {
                System.out.println("error: " + e.getMessage());
            }
        }
    }
}
