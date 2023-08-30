import java.io.*;

// 1.) Do some sort of computation
// 2.) Writes out the result to either a file or the terminal
// 3.) Takes a command-line argument to determine this
public class Test {
    public static boolean doesUserWantTerminal(final String[] args) { ... }
    public static String getFileToWriteTo(final String[] args) { ... }
    public static int doComputation() { ... }
    
    public static void main(final String[] args) {
        final boolean wantsTerminal = doesUserWantTerminal(args);
        final String fileToWriteTo = getFileToWriteTo(args);

        final int result = doComputation();
        
        if (wantsTerminal) {
            System.out.println(result);
        } else {
            final File file = new File(fileToWriteTo);
            final FileOutputStream stream = new FileOutputStream(file);
            stream.writeln(result);
            stream.close();
        }
    }
}

    
