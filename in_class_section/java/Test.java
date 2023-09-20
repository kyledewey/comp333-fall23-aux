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
        final Writer theWriter;
        if (doesUseWantTerminal(args)) {
            // subtyping polymorphism
            theWriter = new TerminalWriter();
            // Writer = TerminalWriter
        } else {
            // subtyping polymorphism
            theWriter = new FileWriter(getFileToWriteTo(args));
        }
        
        // final Writer theWriter = new Writer(doesUserWantTerminal(args),
        //                                     getFileToWriteTo(args));
        final int result = doComputation(theWriter);

        // virtual dispatch/dynamic dispatch/ad-hoc polymorphism
        theWriter.writeThing(Integer.toString(result));
        if (theWriter instanceof TerminalWriter) {
            TerminalWriter.writeThing(theWriter, ...);
        } else if (theWriter instanceof FileWriter) {
            FileWriter.writeThing(theWriter, ...);
        }
        theWriter.close();
    }
}

    
