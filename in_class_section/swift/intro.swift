// public static int addOne(int x) {
//   return x + 1;
// }

//                  -> ReturnType
func addOne(x: Int) -> Int {
    return x + 1;
}

// param: external name
// x: internal name
func addOneExplicitExternalName(param x: Int) -> Int {
    //return param + 1;
    return x + 1;
}

func addOneNoArgumentLabel(_ x: Int) -> Int {
    return x + 1;
}

//                                                  -> Void
//                                                  -> ()
func takesTwoStrings(_ str1: String, _ str2: String) {
    print(str1);
    print(str2);
}

print("Hello world");
print(addOne(x: 3));
print(addOneExplicitExternalName(param: 6));
print(addOneNoArgumentLabel(7));

print(takesTwoStrings("foo", "bar"));

print("Hi", terminator: "");
