// function getArea(rec) {
//     return rec.width * rec.height;
// }

// constructor of rectangles
function Rectangle(w, h) {
    // when called as a constructor:
    // this = {}
    this.width = w;
    this.height = h;
    // TODO: put into prototype
    this.getArea = function () {
        return this.width * this.height;
    };
    // return this;
}
