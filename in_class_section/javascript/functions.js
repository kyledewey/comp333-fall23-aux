// higher-order functions: abstract over computation
// functions are data

// -array: array of integers
// -predicate: function that takes an element, returns
//  true if the element should be printed out

function callMe(foo) {
    foo();
}

function indirectIf(bool, func1, func2) {
    if (bool) {
        func1();
    } else {
        func2();
    }
}

function indirectWhile(foo, boo) {
    if (foo()) {
        // lazy evaluation, non-strict evaluation, call-by-name
        // boo(indirectWhile(foo, boo)); // eager evaluation
        boo();
        indirectWhile(foo, boo); // tail recursion optimization
    }
}

// filter: which elements do I care about?
// for (let index = 0; index < array.length; index++) {
//   if (predicate(array[index])) {
//     // process element / pass on element
//
//
// map: transform the elements
// for (let index = 0; index < array.length; index++) {
//   resultArray[index] = operation(array[index]);

function foreach(array, operation) {
    for (let index = 0; index < array.length; index++) {
        let elem = array[index];
        // do something with elem
        operation(elem);
    }
}

// operator: (CurrentAccumulator, CurrentElement) => NextAccumulator
function reduce(array, initialValue, operator) {
    let accumulator = initialValue;
    for (let index = 0; index < array.length; index++) {
        let element = array[index];
        // accumulator = accumulator + element;
        accumulator = operator(accumulator, element);
    }
    return accumulator;
}
    
function sumAll(array) {
    return reduce(array, 0, (a, e) => a + e);
    // let sum = 0;
    // for (let index = 0; index < array.length; index++) {
    //     let element = array[index];
    //     sum = sum + element;
    // }
    // return sum;
}

function productAll(array) {
    return reduce(array, 1, (a, e) => a * e);
    // let product = 1; // 1 * ??? = ???
    // for (let index = 0; index < array.length; index++) {
    //     let element = array[index];
    //     product = product * element;
    // }
    // return product;
}

// makePairs([]) ==> ""
// makePairs([1]) ==> "pair(1, )"
// makePairs([1, 2, 3]) ==> "pair(1, pair(2, pair(3, )))"
function makePairs(array) {
    return reduce(array, "", (a, e) => "pair(" + e + ", " + a + ")");
}

function abstracted(array, predicate) {
    foreach(array,
            function (elem) {
                if (predicate(elem)) {
                    console.log(elem);
                }
            });
}

function printAllEqualToSix(array) {
    abstracted(array,
               (e) => e === 6);
               // function (e) {
               //     return e === 6;
               // });
}

function printAllElements(array) {
    abstracted(array,
               function (element) {
                   return true;
               });
    // for (let index = 0; index < array.length; index++) {
    //     let elem = array[index];
    //     if (true) {
    //         console.log(elem);
    //     }
    // }
}

function printAllElementsLessThanFive(array) {
    abstracted(array,
               function (e) {
                   return e < 5;
               });
    // for (let index = 0; index < array.length; index++) {
    //     let elem = array[index];
    //     if (elem < 5) {
    //         console.log(elem);
    //     }
    // }
}

function printAllElementsGreaterThan(array, value) {
    abstracted(array,
               (e) => e > value);
}

function printAllElementsGreaterThanTen(array) {
    printAllElementsGreaterThan(array, 10);
    // for (let index = 0; index < array.length; index++) {
    //     let elem = array[index];
    //     if (elem > 10) {
    //         console.log(elem);
    //     }
    // }
}

function isGreaterThanFive(e) {
    return e > 5;
}

function add(x, y) {
    return x + y;
}

function delayedAdd(x) {
    // closure - violates stack discipline
    return function (y) {
        // closes over x
        return x + y;
    }
}

// let addThree = delayedAdd(3)
// let addThree = function (y) {
//                  return 3 + y;
//                };
// let addFour = delayedAdd(4);
// let addFour = function (y) {
//                  return 4 + y;
//               };

// wrapAdd:
// -Takes a function, which takes a parameter
// -Takes an integer
// -Returns a new function, which takes a parameter
//   -Adds this parameter to the integer, then calls the passed function
//
// func wrapAdd(f: (Int) => Int, i: Int) -> (Int) => Int { ... }


function addOne(param) { return param + 1; }

function returnParam(param) { return param; }
                         
// -func takes a parameter
function wrapAdd(func, someInteger) {
    // func = returnParam
    // someInteger = 5
    return function (param) {
        // param = 2
        return func(param + someInteger);
    }
}
