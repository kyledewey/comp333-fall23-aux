// public static int foo(int x) { ... }
func fooWithExplicitExternal(param x: Int) -> Int {
    return x;
}

func fooWithNoExternal(_ x: Int) -> Int {
    return x;
}

func fooWithImplicitExternal(x: Int) -> Int {
    return x;
}

func twoArguments(_ str1: String, _ str2: String) {}

print("Hello");
let temp1 = fooWithExplicitExternal(param: 3);
let temp2 = fooWithNoExternal(4);
let temp3 = fooWithImplicitExternal(x: 5);
print(temp1 + temp2 + temp3);

twoArguments("foo", "bar");

