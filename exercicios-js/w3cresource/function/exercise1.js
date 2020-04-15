/**
 * Exercise 1:
 * Write a JavaScript function that reverse a number.
 */

function reverseANumber(number){
    number = number + "";
    return number.split("").reverse().join("");
}

console.log(reverseANumber(32243));
console.log(reverseANumber(12345));
console.log(reverseANumber(54321));