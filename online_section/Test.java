import java.io.*;

// Does some computation
// Writes output to the console or to a file
// Takes a command-line argument to figure out where to write to
public class Test {
    // TODO: implement these methods
    // public static boolean doesUserWantConsole(final String[] args) { ... }
    // public static String getDestinationFile(final String[] args) { ... }
    public static String getDestinationFileOrNull(final String[] args) { ... }    
    
    // Takes days
    public static int doComputation(final Writer writer) {
        // do some work...
        writer.writeData("still working");

        // do some more work here...
        writer.writeData("yep, still working");
    }
    
    public static void main(final String[] args) {
        final String destinationFile = getDestinationFileOrNull(args);
        final Writer writer;
        if (destinationFile == null) {
            writer = new TerminalWriter();
        } else {
            writer = new FileWriter(destinationFile);
        }
        
        final int result = doComputation(writer);

        writer.writeData(Integer.toString(result));
        writer.close();

        // final Writer writeToFoo = new Writer("foo.txt");
        // final Writer writeToBar = new Writer("bar.txt");
        // writeToFoo.writeData("some data");
        // writeToFoo.writeData("blah");
        // writeToBar.writeData("some other data");
    }
}
