indirect enum List {
    case Nil
    case Cons(String, List)
}

// ["foo", "bar", "baz"]
let list = List.Cons("foo",
                     List.Cons("bar",
                               List.Cons("baz",
                                         List.Nil)));

// []
print(take(list, -1));

// []
print(take(list, 0));

// ["foo", "bar", "baz"]
print(take(list, 4));

// ["foo", "bar"]
print(take(list, 2));

// take is a function that takes two parameters
//   -First: list (List), no argument labels
//   -Second (n): Int, no argument labels
//   -Returns: List holding the first n elements
func take(_ list: List, _ n: Int) -> List {
    // if n <= 0 {
    //     return List.Nil;
    // } else {
    //     switch list {
    //     case .Nil:
    //         return List.Nil;
    //     case let .Cons(head, tail):
    //         return List.Cons(head, take(tail, n - 1));
    //     }
    // }
      
    switch list {
    case .Nil:
        return List.Nil;
    case let .Cons(head, tail):
        if n <= 0 {
            return List.Nil;
        } else {
            return List.Cons(head, take(tail, n - 1));
        }
    }
}
