// algebraic types (enum), pattern matching (switch)

// Basic idea: one type that has multiple, fixed
// alternatives (at compile time)

// boolean is a type
// true and false are values of type boolean
//
// boolean b1 = true;
// boolean b2 = false;
enum MyBool {
    case True
    case False
}

let b1: MyBool = MyBool.True;
let b2 = MyBool.False;

//
// if (b1) {
//   System.out.println("IT'S TRUE");
// } else {
//   System.out.println("IT'S FALSE");
// }
switch b1 {
case .True:
    print("IT'S TRUE");
case .False:
    print("IT'S FALSE");
}

// new type: Color
enum Color {
    case Red
    case Blue
    case Yellow
    case Green
}

let c1: Color = Color.Red;
let c2 = Color.Blue; // c2: Color
// let c3: Color = 0; // won't compile
let c4 = Color.Green;

print(c1);
print(c2);

// pattern matching
switch c4 {
case .Red:
    print("It's red");
case .Blue:
    print("It's blue");
case _:
    print("Default case");
}

enum DivisionResult {
    case DivideByZero
    case DivisionSuccess(Int)
}

func safeDivide(_ x: Int, _ y: Int) -> DivisionResult {
    if y == 0 {
        return DivisionResult.DivideByZero;
    } else {
        return DivisionResult.DivisionSuccess(x / y);
    }
}

print(safeDivide(8, 2));
print(safeDivide(3, 0));
