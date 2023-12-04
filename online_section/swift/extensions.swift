// "object" is ambiguous
// 1.) An instance of a class
// 2.) Some allocated blob in memory

indirect enum List<A> {
    case Nil
    case Cons(A, List<A>)
}

extension List {
    // type variable A is implicitly in scope
    func length() -> Int {
        // self === this
        switch self {
        case .Nil:
            return 0;
        case let .Cons(_, tail):
            return 1 + tail.length();
        }
    }
}

let list1: List<Int> =
  List.Cons(3, List.Cons(4, List.Nil));
print(list1.length());

let list2: List<String> =
  List.Cons("foo", List.Cons("bar", List.Nil));
print(list2.length());

extension Int {
    func doSomething() -> String {
        return "Hello";
    }
    func returnSame() -> Int {
        return self;
    }
}

print(5.doSomething());
print(6.returnSame());
