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

print("-----")


//
// (Int) -> Int: function type that takes an Int and returns an Int
// (A, B) -> C: function type that takes an A and a B, and returns a C
//
// in JavaScript:
// let f2 = (x) => x + 2
let f2: (Int) -> Int = { (x: Int) in x + 2 }
print(f2(2))
print(f2(4))

// let f3 = (x, y) => x + y;
// console.log(f3(2, 3));
let f3: (Int, Int) -> Int = { (x: Int, y: Int) in x + y }
print(f3(2, 3))

// function that takes no parameters
// let printGoodbye = { () in print("goodbye") }
let printGoodbye = { print("goodbye") }
printGoodbye();

let f4: (Int) -> Int = { (x: Int) in
    print(x);
    x + 1
};
