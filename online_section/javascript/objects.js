// Rough Java equivalent
// public class Rectangle {
//   public int width;
//   public int height;
//   public Rectangle(int w, int h) {
//     width = w;
//     height = h;
//   }
//   public int getArea() {
//     return width * height;
//   }
// }

// JavaScript calls:
// 1.) Call to a function - f(1, 2)
// 2.) Call to a constructor - new f(3, 4)
//     this = {};
//     this.__proto__ = f.prototype;
//     ...contructor body...
//     return this;
// 3.) Call to a method - a.f(5, 6)
///    this = a;
//     ...method body...

Rectangle.prototype.getArea = function() {
    return this.width * this.height;
};

function Rectangle(w, h) {
    // when called as a constructor:
    // this = {};
    // this.__proto__ = Rectangle.prototype;
    this.width = w;
    this.height = h;
    // return this;
}
