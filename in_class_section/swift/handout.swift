// // 1.a.)
// // externalName internalName
// func add(a: Int, b: Int) -> Int {
//     return a + b;
// }

// // 1.b.)
// //print(add(a: 2, b: 3))

// // 2.a.)
// func sub(_ x: Int, _ y: Int) -> Int {
//     return x - y;
// }

// func returnMulti(a: Int, b: String) -> (Int, String) {
//     return (a, b)
// }

// func returnMulti2(a: Int) -> (Int, Int) {
//     return (a, a)
// }

// func returnMulti3() -> (String, Int, String) {
//     return ("foo", 2, "bar")
// }

// // 2.b.)
// //print(sub(4, 5))

// // JavaScript
// // function sub(x, y) { return x - y; }
// // let f1 = sub;

// let f1: (Int, Int) -> Int = add;
// print(f1(5, 2));
// print(f1("foo"));

// // let f2 = (x, y) => x * y;
// // console.log(f2(2, 3));
// //
// // (x, y) => {
// //   console.log(x);
// //   console.log(y);
// //   return x * y;
// // }
// let f2: (Int, Int) -> Int =
//   { (x: Int, y: Int) in
//       print(x);
//       print(y);
//       return x * y;
//   };
// print(f2(2, 3));

// //               { () in print("hello") }
// let printHello: () -> () = { print("hello") }
// printHello();

// // 3.a)
// func callsFunc(
//   f: (Int) -> Int,
//   i: Int) -> Int {
//     return f(i);
// }

// // 3.b.)
// callsFunc(
//   //   (x) => 1 + x
//   f: { (x: Int) in 1 + x },
//   i: 5)

//                          () => 1 + 1
//                          { () in 1 + 1 }
// indirectIf(true, ifTrue: { 1 + 1 }, ifFalse: { 2 + 2 })
// indirectIf(false, ifTrue: { 3 + 3 }, ifFalse: { 4 + 4 })
//
// 1.) Takes three parameters
// 2.) First parameter: boolean, no argument label
// 3.) Second parameter: higher-order function, takes no arguments,
//     returns an integer, need argument label ifTrue
// 4.) Third parameter: higher-order function, takes no arguments,
//     returns an integer, need argument label ifFalse
// 5.) Return type: Int
func indirectIf(_ b: Bool, ifTrue: () -> Int, ifFalse: () -> Int) -> Int {
    if b {
        return ifTrue();
    } else {
        return ifFalse();
    }
}
