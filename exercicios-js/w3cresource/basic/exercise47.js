/**
 * Write a JavaScript program to check whether a given number is 
 *      presents in the range 40..10000.
 */

testDigit = (x, y, n) => {
    if (n < 40 || n > 10000) {
        return false;
    } else {
        let isDigit
        (n >= x && n <= y) ? isDigit = true : isDigit = false;

        return isDigit;
    }
}

console.log(testDigit(40, 4000, 45));
console.log(testDigit(80, 320, 79));
console.log(testDigit(89, 4000, 30));