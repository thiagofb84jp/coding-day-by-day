/**
 * Write a JavaScript program to check whether three given numbers are increasing in 
 *      strict mode or in soft mode.
 */

numberOlder = (x, y, z) => {
    if (y > x && z > y) {
        return "Strict mode";
    } else if (z > y) {
        return "Soft mode";
    } else {
        return "Undefined";
    }
}

console.log(numberOlder(10, 15, 31));
console.log(numberOlder(24, 22, 31));
console.log(numberOlder(50, 21, 15));