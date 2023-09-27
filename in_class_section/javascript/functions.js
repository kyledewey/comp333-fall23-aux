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

function abstracted(array, predicate) {
    for (let index = 0; index < array.length; index++) {
        let elem = array[index];
        if (predicate(elem)) {
            console.log(elem);
        }
    }
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

function printAllElementsGreaterThanTen(array) {
    abstracted(array,
               function (e) {
                   return e > 10;
               });
    // for (let index = 0; index < array.length; index++) {
    //     let elem = array[index];
    //     if (elem > 10) {
    //         console.log(elem);
    //     }
    // }
}

// function add(x, y) {
//     return x + y;
// }

add = function (x, y) {
    return x + y;
}

function isGreaterThanFive(e) {
    return e > 5;
}

