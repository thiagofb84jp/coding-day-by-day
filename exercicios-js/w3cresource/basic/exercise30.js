/**
 * Exercise 30:
 * Write a JavaScript program to check whether two given integer values are in the range 50..99 (inclusive). 
 * Return true if either of them are in the said range.
 */

function checkNumbers(x, y){
    if ((x >= 50 && x <= 99) || (y >= 50 && y <= 99)) {
        return true;
    } else {
        return false;
    }
}

console.log(checkNumbers(12, 101)); //false
console.log(checkNumbers(52, 80)); //true
console.log(checkNumbers(15, 99)); //true