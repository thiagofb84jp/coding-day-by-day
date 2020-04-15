/**
 * Exercise 27:
 * Write a JavaScript program to check whether a given positive number is a 
 * multiple of 3 or a multiple of 7.
 */

function test37(x){
    if (x % 3 === 0 || x % 7 === 0) {
        return true;
    } else {
        return false;
    }
}

console.log(test37(12)); //true
console.log(test37(14)); //true
console.log(test37(10)); //false
console.log(test37(11)); //false