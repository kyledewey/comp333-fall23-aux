// generics / parametric polymorphism
//
// Idea: introduce type variables
//       - Variable that holds a type

// generics
// type variable: A
indirect enum List<A> {
    case Nil
    case Cons(A, List<A>)
}

func length<T>(_ list: List<T>) -> Int {
    switch list {
    case .Nil:
        return 0;
    case let .Cons(_, tail):
        return 1 + length(tail);
    }
}

let list1: List<Int> =
  List.Cons(3, List.Cons(4, List.Nil));
print(length(list1));

let list2: List<String> =
  List.Cons("foo", List.Cons("bar", List.Nil));
print(length(list2));

// Won't compile - A's don't match (Int vs. String)
// let list3: List<Int> =
//   //        Int  List<String>
//   List.Cons(5,   list2);
