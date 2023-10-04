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

function foreach(array, operation) {
    for (let index = 0; index < array.length; index++) {
        let elem = array[index];
        // do something with elem
        operation(elem);
    }
}

function sumAll(array) {
    let sum = 0;
    foreach(array,
            function (elem) {
                sum = sum + elem;
            });
    return sum;
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
