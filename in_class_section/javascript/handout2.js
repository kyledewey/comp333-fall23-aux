function AddThis(x) {
    this.x = x;
}
AddThis.prototype.add = function (y) {
    return this.x + y;
}

let withOne = new AddThis(1);
let withFive = new AddThis(5);
console.log(withOne.add(1));  // 2
console.log(withFive.add(2)); // 7

AddThis.prototype.sub = function (s) {
    return s - this.x;
}

console.log(withOne.sub(2));

mul.prototype = new AddThis();
AddThis.prototype.method = function 
