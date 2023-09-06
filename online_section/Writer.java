// Destinations:
// 1.) terminal - new Writer(); new TerminalWriter()
// 2.) file - new Writer("foo.txt"); new FileWriter("foo.txt")
// 3.) network location - new Writer(new IPAddress("127.0.0.1")); new NetworkWriter(new IPAddress("127.0.0.1"));
// 4.) database - new Writer(new DatabaseHandle(...)); new DatabaseWriter(new DatabaseHandle(...));
//
// new Writer("foo.txt", new IPAddress("128.0.0.1"), null) - ???
//
// Problem #1: we can encode states that are invalid; user unfriendly
// Problem #2: our if/elses blow up
// Problem #3: waste of memory

public abstract class Writer {
    public abstract void writeData(final String data);

    // 1.) Should be a separate method to write output
    // 2.) Files should only be opened once
    // public void writeData(final String data) {
    //     if (stream == null) {
    //         System.out.println(data);
    //     } else {
    //         try {
    //             stream.writeln(data);
    //         } catch (final Exception e) {
    //             System.out.println("error: " + e.getMessage());
    //         }
    //     }
    // }
}
