/**
 * Exercise 31:
 * Write a JavaScript program to check whether three given integer values are in the range 50..99 (inclusive). Return true if 
 * one or more of them are in the said range.
 */

function checkThreeNumbers(x, y, z){
    return ((x >= 50 && x <= 99) || (y >= 50 && y <= 99) || (z >= 50 && z <= 99));
}

console.log(checkThreeNumbers(50, 90, 99)); //true
console.log(checkThreeNumbers(5, 9, 199)); //false
console.log(checkThreeNumbers(65, 89, 199)); //true
console.log(checkThreeNumbers(65, 9, 199)); //true