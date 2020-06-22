/**
 * Write a JavaScript program to check two given integer values and return true if one of the number is 15 or if their sum 
 *      or difference is 15.
 */

testNumber = (x, y) => {
    return (x === 15 || y === 15 || x + y === 15 || Math.abs(x - y) === 15);
}

console.log(testNumber(15, 9));
console.log(testNumber(25, 15));
console.log(testNumber(7, 8));
console.log(testNumber(25, 10));
console.log(testNumber(5, 9));
console.log(testNumber(7, 9));
console.log(testNumber(9, 25));