// NOT Java
// 10 day design and implementation
// client-side execution on the web
// node.js: from Chrome - V8

// Java
// int x = 10;
// x = "foo"; // won't compile
// System.out.println(x);
//

// let declares a variable
// let x = 10;
// x = "foo";
// console.log(x); // how you print stuff

// Java: statically typed - variables have fixed types, determined at compile time
// JavaScript: dynamically typed - variables are just buckets that anything can get thrown in

// Java:
// public static int add(int x, int y) { return x + y; }
// public static String add(String x, String y) { return x + y; }

function add(x, y) {
    return x + y;
}

// console.log(add(2, 1));
// console.log(add("foo", "bar"));
// console.log(add(5, "foo"));
// console.log(add("bar", 7));

// Java:
// public static (boolean || String) doSomething(int x) { ... }
function doSomething(x) {
    if (x < 5) {
        return true;
    } else {
        return "blah";
    }
}

// console.log(doSomething(0));
// console.log(doSomething(10));

// Java:
// public static ArrayList<SomeObject> someMethod() {
//   ArrayList<SomeObject> list = new ArrayList<SomeObject>();
//   return list;
// }

function someMethod() {
    list = [];
    return list;
}


// Advantages:
// - More programs are possible
// - Don't need to write so much (especially types)
//
// Disadvantages:
// - More programs are possible
// - Performance
// - Need semantics for more things
// - Memory characteristics


// runtime speed
