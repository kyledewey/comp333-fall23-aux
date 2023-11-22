protocol Add {
    func add(_ other: Self) -> Self;
}

extension Int : Add {
    func add(_ other: Int) -> Int {
        return self + other;
    }
}

extension Double : Add {
    func add(_ other: Double) -> Double {
        return self + other;
    }
}

func add<A: Add>(_ x: A, _ y: A) -> A {
    return x.add(y);
}

add(1, 2);
add(1.1, 2.2);
add("foo", "bar");
