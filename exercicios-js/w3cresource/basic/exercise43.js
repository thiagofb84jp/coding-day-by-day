/**
 * Write a JavaScript program to check from three given numbers (non negative integers) that two or all of them have the 
 *      same rightmost digit.
 */

function sameLastDigit(x, y, z) {
    return (x % 10 === y % 10) ||
           (x % 10 === z % 10) ||
           (y % 10 === z % 10);
}

console.log(sameLastDigit(22, 32, 42));
console.log(sameLastDigit(102, 302, 2));
console.log(sameLastDigit(20, 22, 45));