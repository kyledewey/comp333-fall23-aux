// let lessThanThree = (i) => i < 3;
let lessThanThree: (Int) -> Bool = { i in i < 3 };
let isEven: (Int) -> Bool = { x in x % 2 == 0 };
let greaterThanTwo: (Int) -> Bool = { i in i > 2 };
let isOdd: (Int) -> Bool = { i in i % 2 == 1 };

print(bothTrue(lessThanThree, isEven, 2)); // true
print(bothTrue(greaterThanTwo, isOdd, 3)); // true
print(bothTrue(isOdd, isEven, 4)); // false

// -bothTrue is a function that takes three parameters
//    -First: (Int) -> Bool, no argument label
//    -Second: (Int) -> Bool, no argument label
//    -Third: Int, no argument label
//    -Returns: Bool; true if the integer is true according to both
//     functions

func bothTrue(_ f1: (Int) -> Bool,
              _ f2: (Int) -> Bool,
              _ i: Int) -> Bool {
    return f1(i) && f2(i);
    
    // let b1: Bool = f1(i);
    // let b2: Bool = f2(i);
    // return b1 && b2;
}

