/**
 * Exercise 5:
 * Write a JavaScript program to get the volume of a Cylinder with four decimal places using object 
 *  classes.
 * - Volume of a cylinder : V = πr2h
 * - where r is the radius and h is the height of the cylinder.
 * 
 */

function cylinder(cylHeight, cylDiameter) {
    this.cylHeight = cylHeight;
    this.cylDiameter = cylDiameter;
}

cylinder.prototype.volume = function () {
    let radius = this.cylDiameter / 2;

    return this.cylHeight * Math.PI * radius * radius;
};

let cyl = new cylinder(7, 4);

console.log('Volume = ', cyl.volume().toFixed(4));