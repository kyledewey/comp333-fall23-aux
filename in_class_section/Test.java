import java.io.*;

public class Test {
    public static boolean doesUserWantTerminal(final String[] args) { ... }
    public static String getFileToWriteTo(final String[] args) { ... }

    public static FileOutputStream stream = null;

    public static void writeThing(final boolean wantsTerminal,
                                  final String fileToWriteTo,
                                  final String thing) {
        if (wantsTerminal) {
            System.out.println(thing);
        } else {
            if (stream == null) {
                final File file = new File(fileToWriteTo);
                stream = new FileOutputStream(file);
            }
            stream.writeln(thing);
        }
    }
        
    // duplication
    public static int doComputation(final boolean wantsTerminal,
                                    final String fileToWriteTo) {
        // do some work
        writeThing(wantsTerminal, fileToWriteTo, "did something");
        
        // do some more work
        writeThing(wantsTerminal, fileToWriteTo, "did something else");
    }
    
    public static void main(final String[] args) {
        final boolean wantsTerminal = doesUserWantTerminal(args);
        final String fileToWriteTo = getFileToWriteTo(args);

        final int result = doComputation();
        
        writeThing(wantsTerminal, fileToWriteTo, Integer.toString(result));
        if (stream != null) {
            stream.close();
        }
    }
}

    
