// Dominates the web - client-side code execution
// NOT Java
// Designed and implemented in 10 days - Netscape
// Different JavaScript "engines"
// v8 - node.js: run JavaScript at the command-line

// Java:
// statically-typed: variables have a fixed type
// int someBigVariable = 10;
// someBigVariable = "foo"; // won't compile
// System.out.println(someBigVariable);
//
// Object obj = "foobar";
// ((String)obj).length(); // won't compile
// Statically-typed languages: casting is necessary (or at least nice)

// runs on an interpreter

// let someBigVariable = 10;
// someBigVariable = "foo";
// // dynamically-typed: variables have no inherent type
// console.log(someBigVariable); // how you print
// console.log(someBigVariable.length);

// public static int add(int x, int y) { return x + y; }
// public static String add(String x, String y) { return x + y; }

function add(x, y) {
    return x + y;
}

// console.log(add(2, 5));
// console.log(add("foo", "bar"));
// console.log(add(2, "bar"));
// console.log(add("foo", 5));

// public static ??? doSomething(int x) {
//   if (x < 5) {
//     return true;
//   } else {
//     return "some string";
//   }
// }
function doSomething(x) {
    if (x < 5) {
        return true;
    } else {
        return "some string";
    }
}

console.log(doSomething(0));
console.log(doSomething(10));

// Java:
// public ArrayList<MyBigObject> doSomething() {
//   ArrayList<MyBigObject> list = new ArrayList<MyBigObject>();
//   return list;
// }
//
// JavaScript:
// function doSomething() {
//   let list = [];
//   return list;
// }
//
// JavaScript
// -Object-oriented (prototype-based)

// Dynamic typing
//
// Advantages:
//   -More programs are possible
//   -Less repetition (no types to write)
// Disadvantages:
//   -More programs are possible
//   -Weird behavior on type errors / more possible semantic issues
//   -Performance

// Syntax errors
// JavaScript: 1 + + 2
// English: I want to with the Dog to the store go
//
// Semantic error:
// JavaScript: "foo".fkjbfkjbrkjbfebn
// English: I have an invisible green frog that sleeps furiously

// JavaScript vs. Java
// JavaScript would be faster - hit yes/no

// strong vs. weak typing - hit yes/no
