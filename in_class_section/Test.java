import java.io.*;

public class Test {
    public static boolean doesUserWantTerminal(final String[] args) { ... }
    public static String getFileToWriteTo(final String[] args) { ... }

    // duplication
    public static int doComputation(final Writer theWriter) {
        // do some work
        theWriter.writeThing("did something");
        
        // do some more work
        theWriter.writeThing("did something else");
    }        
    
    public static void main(final String[] args) {
        final Writer theWriter = new Writer(doesUserWantTerminal(args),
                                            getFileToWriteTo(args));
        final int result = doComputation(theWriter);
        
        theWriter.writeThing(Integer.toString(result));
        theWriter.close();
    }
}

    
