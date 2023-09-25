// higher-order functions
// closures
// lambdas
// anonymous functions
//
// basic idea: computations are data - functions are data
function printAllElements(array) {
    for (let index = 0; index < array.length; index++) {
        let element = array[index];
        if (true) {
            console.log(element);
        }
    }
}

function printAllElementsLessThanFive(array) {
    for (let index = 0; index < array.length; index++) {
        let element = array[index];
        if (element < 5) {
            console.log(element);
        }
    }
}

function printAllElementsGreaterThanTen(array) {
    for (let index = 0; index < array.length; index++) {
        let element = array[index];
        if (element > 10) {
            console.log(element);
        }
    }
}

function printAllElementsEqualToSix(array) {
    for (let index = 0; index < array.length; index++) {
        let element = array[index];
        if (element === 6) {
            console.log(element);
        }
    }
}
