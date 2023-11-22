let f: (Double) -> Double = { x in x + 1.0 };
print(f(3));
print(f(3.14));

func add<A>(_ x: A, _ y: A) -> A {
    return x + y;
}
