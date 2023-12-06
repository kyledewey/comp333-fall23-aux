// generics: type variables on data
// parametric polymorphism: type variables on functions
// type variables: variable that holds a type

// A: type variable
indirect enum MyList<A> {
    case Nil
    case Cons(A, MyList<A>)
}

let list1 = MyList.Cons(1, MyList.Nil); // list1: MyList<Int>
let list2: MyList<String> = MyList.Cons("foo", MyList.Nil);

// forall T.length
func length<T>(_ list: MyList<T>) -> Int {
    switch list {
    case .Nil:
        return 0;
    case let .Cons(_, tail):
        return 1 + length(tail);
    }
}

func otherId(_ value: String) -> String {
    return value;
}

func id<A>(_ value: A) -> A {
    return value;
}

func pair<A, B>(_ a: A, _ b: B) -> (A, B) {
    return (a, b);
}

func pair2<A>(_ a1: A, _ a2: A) -> (A, A) {
    return (a1, a2);
}

let p1: (String, Int) = pair("foo", 4);
let p2: (Int, Bool) = pair(5, false);
print(p1);
print(p2);

func mkPair() -> (Int, String) {
    return (4, "foo");
}

print(length(list1)); // T = Int
print(length(list2)); // T = String
print(id(4));
print(id(true));

// indirect enum StringList {
//     case StringNil
//     case StringCons(String, StringList)
// }

// func length(_ list: StringList) -> Int {
//     switch list {
//     case .StringNil:
//         return 0;
//     case let .StringCons(_, tail):
//         return 1 + length(tail);
//     }
// }

// let list = StringList.StringCons("foo", StringList.StringNil);
