/**
 * Exercise 22:
 * Write a JavaScript program to check from two given integers, whether one is 
 * positive and another one is negative.
 */

function isPositiveNegative(x, y){
    if ((x < 0 && y > 0) || x > 0 && y < 0) {
        return true;
    } else {
        return false;
    }
}

console.log(isPositiveNegative(2, 2)); //false
console.log(isPositiveNegative(-2, 2)); //true
console.log(isPositiveNegative(2, -2)); //true
console.log(isPositiveNegative(-2, -2)); //false