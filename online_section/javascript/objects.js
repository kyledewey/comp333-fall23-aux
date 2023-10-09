function getArea(rec) {
    return rec.width * rec.height;
}

// constructor of rectangles
function Rectangle(w, h) {
    // when called as a constructor:
    // this = {}
    this.width = w;
    this.height = h;
    // return this;
}
