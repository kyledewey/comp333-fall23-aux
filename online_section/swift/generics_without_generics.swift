// generics / parametric polymorphism

indirect enum IntList {
    case IntNil
    case IntCons(Int, IntList)
}

func length(_ list: IntList) -> Int {
    switch list {
    case .IntNil:
        return 0;
    case let .IntCons(_, tail):
        // [4, 2, 8, 7]
        // tail: [2, 8, 7]
        // length(tail): 3
        return 1 + length(tail);
    }
}

indirect enum StringList {
    case StringNil
    case StringCons(String, StringList)
}

func length(_ list: StringList) -> Int {
    switch list {
    case .StringNil:
        return 0;
    case let .StringCons(_, tail):
        // [4, 2, 8, 7]
        // tail: [2, 8, 7]
        // length(tail): 3
        return 1 + length(tail);
    }
}

let list1 = IntList.IntCons(2, IntList.IntNil);
print(length(list1));
let list2 = StringList.StringCons("foo", StringList.StringNil);
print(length(list2));
