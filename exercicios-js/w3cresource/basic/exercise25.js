/**
 * Exercise 25:
 * Write a JavaScript program to create a new string from a given string changing the position of first and last characters. The string length must 
 * be greater than or equal to 1.
 */

function firstLast(str1){
    if (str1.length <= 1) {
        return str1;
    }
    
    midChar = str1.substring(1, str1.length - 1);
    return (str1.charAt(str1.length - 1)) + midChar + str1.charAt(0);
}

console.log(firstLast('a'));
console.log(firstLast('ab'));
console.log(firstLast('abc'));
console.log(firstLast('mary'));