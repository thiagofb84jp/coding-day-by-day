/**
 * Write a JavaScript program to check whether three given numbers are increasing in strict mode or 
 *      in soft mode.
 */

numberOlder = (x, y, z) => {
    let strict;

    if(y > x && z > y) {
        return "strict mode"
    } else if (z > y) {
        return "soft mode";
    } else {
        return "Undefinded";
    }
}

console.log(numberOlder(10, 15, 31));
console.log(numberOlder(24, 22, 31));
console.log(numberOlder(50, 21, 15));