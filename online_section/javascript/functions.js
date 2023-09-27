// higher-order functions
// closures
// lambdas
// anonymous functions
//
// basic idea: computations are data - functions are data

// -array: the array of elements
// -predicate: a function that takes an element; returns
//  true if the element should be printed
function printElementsMatching(array, predicate) {
    for (let index = 0; index < array.length; index++) {
        let element = array[index];
        // using the higher-order function
        // if (element < 5) {
        if (predicate(element)) {
            console.log(element);
        }
    }
}

function printAllElementsLessThanFive(array) {
    printElementsMatching(array,
                          function (e) {
                              return e < 5;
                          });
    // for (let index = 0; index < array.length; index++) {
    //     let element = array[index];
    //     if (element < 5) {
    //         console.log(element);
    //     }
    // }
}

function printAllElements(array) {
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
