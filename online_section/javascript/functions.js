// higher-order functions
// closures
// lambdas
// anonymous functions
//
// basic idea: computations are data - functions are data

// filter: loop with an if in it
// for (let index = 0; index < array.length; index++) {
//   if (condition(array[index])) {
//     // do something with element

// map: loop where you do something to each element and
// save the result
// for (let index = 0; index < array.length; index++) {
//   savedResult[index] = operation(array[index]);
//

function foreach(array, operation) {
    for (let index = 0; index < array.length; index++) {
        let element = array[index];
        // do something with the element
        operation(element);
    }
    // maybe return
}

function reduce(array, initialValue, operation) {
    let accumulator = initialValue;
    // operation: (currentAccumulator, currentElement) => nextAccumulator
    for (let index = 0; index < array.length; index++) {
        let element = array[index];
        accumulator = operation(accumulator, element);
    }
    return accumulator;
}

// [3, 2, 1] => pair(1, pair(2, pair(3, "")))
function makePairs(array) {
    return reduce(array,
                  "",
                  (accum, elem) => "pair(" + elem + ", " + accum + ")");
}

function sumAll(array) {
    return reduce(array, 0, (accumulator, elem) => accumulator + elem);
    // let sum = 0; // starting value
    // for (let index = 0; index < array.length; index++) {
    //     let element = array[index];
    //     sum = sum + element; // operation
    // }
    // return sum;
}

function productAll(array) {
    return reduce(array, 1, (accumulator, elem) => accumulator * elem);
    // let product = 1; // 1 * ??? = ???
    // for (let index = 0; index < array.length; index++) {
    //     let element = array[index];
    //     product = product * element;
    // }
    // return product;
}

// -array: the array of elements
// -predicate: a function that takes an element; returns
//  true if the element should be printed
function printElementsMatching(array, predicate) {
    // array.filter(predicate).forEach(console.log);
    // array.filter(predicate).forEach((e) => console.log(e));
    
    foreach(array,
            function (element) {
                if (predicate(element)) {
                    console.log(element);
                }
            });
}

function printAllElementsLessThan(array, amount) {
    printElementsMatching(array,
                          // closes over amount
                          function (e) {
                              return e < amount;
                          });
}

function printAllElementsLessThanFive(array) {
    printAllElementsLessThan(array, 5);
    // printElementsMatching(array,
    //                       function (e) {
    //                           return e < 5;
    //                       });
    // for (let index = 0; index < array.length; index++) {
    //     let element = array[index];
    //     if (element < 5) {
    //         console.log(element);
    //     }
    // }
}
// array.forEach((e) => console.log(e))

function printAllElements(array) {
    // array.filter((e) => true).forEach(console.log);
    printElementsMatching(array,
                          function (e) {
                              return true;
                          });
    // for (let index = 0; index < array.length; index++) {
    //     let element = array[index];
    //     if (true) {
    //         console.log(element);
    //     }
    // }
}

function printAllElementsGreaterThanTen(array) {
    printElementsMatching(array,
                          function (e) {
                              return e > 10;
                          });
    // for (let index = 0; index < array.length; index++) {
    //     let element = array[index];
    //     if (element > 10) {
    //         console.log(element);
    //     }
    // }
}

function printAllElementsEqualToSix(array) {
    printElementsMatching(array,
                          function (e) {
                              return e === 6;
                          });
    // for (let index = 0; index < array.length; index++) {
    //     let element = array[index];
    //     if (element === 6) {
    //         console.log(element);
    //     }
    // }
}

function indirectIf(cond, first, second) {
    if (cond) {
        first();
    } else {
        second();
    }
}

function indirectWhile(first, second){
    if (first()) {
        second();
        indirectWhile(first,second);
    }
}

// in Swift:
// func wrapAdd(f: (Int) => Int, z: Int) -> (Int) => Int { ... }
function wrapAdd(f, z) {
    return function (x) {
        return f(x + z);
    }
}

// add(3, 4)
// -First-order functions obey stack discipline: parameters and local
//  variables can be allocated on the stack
function add(x, y) {
    return x + y;
}

// -Higher-order functions often don't obey stack discipline
function delayedAdd(x) {
    return function (y) {
        // closure - closes over x's value
        return x + y;
    }
}

// let addThree = delayedAdd(3)
// let addThree = function (y) { return 3 + y; }
// saving nested function in delayedAdd, as well as x = 3

// let addFour = delayedAdd(4)
// let addFour = function (y) { return 4 + y; }
// saving nested function in delayedAdd, as well as x = 4
