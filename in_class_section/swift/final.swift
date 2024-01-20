enum SomeData {
    case foo(Int, Double)
    case bar(Bool)
    case baz
}

let d1: SomeData = SomeData.foo(2, 3.1);
let d2: SomeData = SomeData.bar(true);
let d3: SomeData = SomeData.baz;

print(d1); // foo(2, 3.1)
print(d2); // bar(true)
print(d3); // baz

// d1: SomeData
// switch d1 {
// case .foo(_, _):
