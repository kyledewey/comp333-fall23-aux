// implicitly returns Void
func printHello() {
    print("Hello")
}

func addOne(_ x: Int) -> Int {
    return x + 1
}

// f(x) = x
// parametric polymorphism - type variable
// on a function
func id<A>(_ param: A) -> A {
    return param
}

print(addOne(3))

// f: (Int) -> String
// addOne: (Int) -> Int
// let f: (Int) -> Int = addOne;
let f = addOne
print(f(4))

// () == Void
let g: () -> () = printHello

print(id(6))
print(id("foo"))

// in JavaScript:
// let f2 = (x) => x + 2
print("-----")
let f2 = { (x: Int) in x + 2 }
print(f2(2))
print(f2(4))
