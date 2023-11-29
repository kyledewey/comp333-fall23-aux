// algebraic data types
//
// Basic idea: encoding the idea of one thing that can
// be a choice of things (something like OR)
//
// Example (that's not exactly algebraic data types):
// 
// boolean b1 = true;
// boolean b2 = false;
//
// true and false are both booleans, but there is no
// type True or Type false: boolean encapsulates the
// choice between true and false
//
// if (b1) {
//   System.out.println("IT'S TRUE");
// } else {
//   System.out.println("IT'S FALSE");
// }

// enumeration - declares we have MyBool as a type
// Also declares that Truth and Falsehood are the two
// values of that type
enum MyBool {       // boolean
    case Truth      // true
    case Falsehood  // false
}

let b1: MyBool = MyBool.Truth;
let b2 = MyBool.Falsehood; // infer b2: MyBool

switch b1 {
case .Truth:
    print("IT'S TRUE");
case .Falsehood:
    print("IT'S FALSE");
}

enum DivisionResult {
    case Success(Int)
    case DivideByZero
}

enum Animal {
    case Cat
    case Dog
}

func safeDivide(_ x: Int, _ y: Int) -> DivisionResult {
    if y == 0 {
        return DivisionResult.DivideByZero;
    } else {
        return DivisionResult.Success(x / y);
    }
}

print(safeDivide(2, 3));
print(safeDivide(2, 0));

indirect enum ImmutableList {
    case Nil                      // constructor
    case Cons(Int, ImmutableList) // constructor
}

// Using the prior enum definition, create a list
// containing 1, 2, and 3, in that order.

let x: ImmutableList =
  ImmutableList.Cons(1,
                     ImmutableList.Cons(2,
                                        ImmutableList.Cons(3,
                                                           ImmutableList.Nil)));

// different binary tree nodes:
// 1.) Leaf node, contains no data
// 2.) Internal node, contains:
//     - Left child
//     - Value (Integer)
//     - Right child
indirect enum Node {
    case Leaf
    case Internal(Node, Int, Node)
}

//
//    3
//   / \
//  X   X
let tree1: Node =
  Node.Internal(Node.Leaf, 3, Node.Leaf);
print(tree1);

//
//       5
//      / \
//     /   \
//    2     7
//   / \   / \
//  X   X X   X
let tree2: Node =
  Node.Internal(
    Node.Internal(Node.Leaf, 2, Node.Leaf),
    5,
    Node.Internal(Node.Leaf, 7, Node.Leaf));
print(tree2);

// calculate the sum of all nodes in a tree
// leaf nodes have a sum of 0
// treeSum(Node.Leaf): 0
func treeSum(_ tree: Node) -> Int {
    // switch: performs pattern matching
    switch tree {
    case .Leaf:
        return 0;
    case let .Internal(leftNode, value, rightNode):
        // case Internal(Node, Int, Node)
        //   - leftNode: Node
        //   - value: Int
        //   - rightNode: Node
        let leftSum = treeSum(leftNode);
        let rightSum = treeSum(rightNode);
        return leftSum + value + rightSum;
    }
}

print(treeSum(tree1));
print(treeSum(tree2));

switch tree1 {
    //    ?: value
    //   / \
    //  X   X
case let .Internal(Node.Leaf, value, Node.Leaf):
    print(value);

    //      ?
    //     / \
    //    2   X
    //   / \
    //  ?   ?
case let .Internal(Node.Internal(first, 2, second), third, Node.Leaf):
    // ...

    
    // matches everything
case _:
    print("Default");
}
