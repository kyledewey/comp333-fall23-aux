// Java: class-based OOP
// JavaScript: prototype-based OOP

// Classes:
// - Class is a template to build an object with
// - Classes inherit from other classes

// Prototypes:
// - Objects all the way down
// - Can inherit from a prototype (just another object)

function getArea(rec) {
    return rec.width * rec.height;
}

// Constructor
function Rectangle(w, h) {
    // this = {}
    this.width = w;
    this.height = h;
    // return this;
}
