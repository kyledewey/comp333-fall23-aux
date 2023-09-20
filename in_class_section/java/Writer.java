// Destinations:
// -Terminal: new Writer()
// -File: new Writer("foo.txt")
// -Network location: new Writer(new IPAddress("127.0.0.1"))
// -Database: new Writer(new DatabaseHandle(...))
//
// new Writer("foo.txt", new IPAddress("127.0.0.1"), null) - invalid state
//
// Problems:
// #1: blow-up of if/else
// #2: wasting memory
// #3: invalid states are representable
public interface Writer {
    public void writeThing(final String thing);
}
