function Base() {}
function Sub1() {}
function Sub2() {}

Base.prototype.method= function() { console.log("base"); }
Sub1.prototype.method = function(){ console.log("sub1"); }
Sub2.prototype = Base.prototype;

let base = new Base();
let sub1 = new Sub1();
let sub2 = new Sub2();
base.method(); // prints "base"
sub1.method(); // prints "sub1"
sub2.method(); // prints "base"
console.log(base instanceof Base); // prints "true"
console.log(sub1 instanceof Base); // prints "true"
console.log(sub2 instanceof Base); // prints "true"

