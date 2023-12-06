indirect enum MyList<A> {
    case Nil
    case Cons(A, MyList<A>)
}

func getFirstOrElse<T>(_ list: MyList<T>, _ param: T) -> T {
    // list: MyList<T>
    switch list {
    case .Nil:
        return param;
    case let .Cons(head, _):
        // Cons(T, MyList<T>)
        // head: T
        // tail: MyList<T>
        return head;
    }
}
        
extension MyList {
    // implicitly type variable A is in scope
    func length() -> Int {
        switch self {
        case .Nil:
            return 0;
        case let .Cons(_, tail):
            return 1 + tail.length();
        }
    }

    // [1, 2, 3].getFirstOrElse(4) => 1
    // [].getFirstOrElse(4) => 4
    func getFirstOrElse(_ param: A) -> A {
        // self: MyList<A>
        switch self {
        case .Nil:
            return param;
        case let .Cons(head, _):
            // head: A
            return head;
        }
    }

    func headEquals(_ param: A, compare: (A, A) -> Bool) -> Bool {
        switch self {
        case .Nil:
            return false;
        case let .Cons(head, _):
            return compare(param, head);
        }
    }
}

let list1 = MyList.Cons("foo", MyList.Cons("bar", MyList.Nil));
print(list1.length());

extension Int {
    func increment() -> Int {
        // self == this
        // self: Int
        return self + 1;
    }
}

print(2.increment());
print(3.increment());
