// Java: class-based OOP
// JavaScript: prototype-based OOP

// Classes:
// - Class is a template to build an object with
// - Classes inherit from other classes

// Prototypes:
// - Objects all the way down
// - Can inherit from a prototype (just another object)

// let temp = {
//     'getArea': function() {
//         return this.width * this.height;
//     }
// };

// Rectangle = function(w, h) { ... }

Rectangle.prototype.getArea = function() {
    return this.width * this.height;
};

// Constructor
function Rectangle(w, h) {
    // this = {};
    // this.__proto__ = Rectangle.prototype;    
    this.width = w;
    this.height = h;
    // return this;
}

// Calls:
// 1.) Function call - f(1, 2)
// 2.) Constructor call - new f(3, 4)
//     this = {};
//     ...body of constructor...
//     return this;
// 3.) Method call - a.f(5, 6)
//     this = a;
//     ...body of method...
