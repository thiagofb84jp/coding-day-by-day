/**
 * Exercise 21:
 * Write a JavaScript program to check whether a given integer is within 20 of 100 or 400.
 */

function testHundred(x){
    return ((Math.abs(100 - x) <= 20) || (Math.abs(400 - x) <= 20));
}

console.log(testHundred(10)); //false
console.log(testHundred(90)); //true
console.log(testHundred(99)); //true
console.log(testHundred(199)); //false
console.log(testHundred(200)); //false