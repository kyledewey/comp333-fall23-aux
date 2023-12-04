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

indirect enum Tree {
    case Leaf
    case Internal(Tree, Int, Tree)
}

// treeSum(Tree.Leaf): 0
func treeSum(_ tree: Tree) -> Int {
    switch tree {
        // X
    case .Leaf:
        return 0;

        //   ?
        //  / \
        // ?   ?
    case let .Internal(leftChild, value, rightChild):
        // leftChild: Tree
        // value: Int
        // rightChild: Tree
        let leftSum = treeSum(leftChild);
        let rightSum = treeSum(rightChild);
        return leftSum + value + rightSum;
    }
}

// X
let tree1: Tree = Tree.Leaf;

//   3
//  / \
// X   X
let tree2: Tree =
  Tree.Internal(Tree.Leaf, 3, Tree.Leaf);

//       4
//      / \
//     /   \
//    2     5
//   / \   / \
//  X   X X   X
let tree3 =
  Tree.Internal(
    Tree.Internal(
      Tree.Leaf,
      2,
      Tree.Leaf),
    4,
    Tree.Internal(
      Tree.Leaf,
      5,
      Tree.Leaf));

print("---------");
print(treeSum(tree1));
print(treeSum(tree2));
print(treeSum(tree3));

indirect enum MyList {
    case Nil
    case Cons(Int, MyList)
}

// ImmutableList list = new Cons(1, new Cons(2, new Cons(3, new Nil())));
let list = MyList.Cons(1, MyList.Cons(2, MyList.Cons(3, MyList.Nil)));

// switch tree1 {
//     //   2
//     //  / \
//     // ?   X
// case let .Internal(leftChild, 2, Tree.Leaf):
//     print(leftChild);

//     //      ?
//     //     / \
//     //    /   \
//     //   1     ?
//     //  / \   / \
//     // ?   ? X   _
// case let .Internal(.Internal(first, 1, second),
//                    third,
//                    .Internal(Tree.Leaf, fourth, _)):
    
switch list {
case let .Cons(2, _):
    return 0;
    
}

