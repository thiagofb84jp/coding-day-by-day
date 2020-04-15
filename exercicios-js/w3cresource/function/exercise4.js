/**
 * Exercise 4:
 * Write a JavaScript function that accepts a number as a parameter and check the number is 
 * prime or not.
 */

function testPrime(number){
    if (number === 1) {
        return false;
    } else if (number === 2) {
        return true;
    } else {
        for(let x = 2; x < number; x++){
            if (number % x === 0) {
                return false;
            }
        }
        return true;
    }
}

console.log(testPrime(37)); //true
console.log(testPrime(55)); //false
console.log(testPrime(2)); //true