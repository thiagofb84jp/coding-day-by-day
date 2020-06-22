/**
 * Write a JavaScript program to check three given numbers, if the three numbers are same return 30 otherwise return 20 and if two numbers 
 *      are same return 40.
 */

function threeNumbers(x, y, z) {
    if (x == y && y == z) {
        return 30;
    } else if (x == y || y == z || z == x) {
        return 40;
    } else {
        return 20;
    }
}

console.log(threeNumbers(8, 8, 8)); //30
console.log(threeNumbers(8, 8, 18)); //40
console.log(threeNumbers(8, 7, 18)); //20