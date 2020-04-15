/**
 * Exercise 26:
 * Write a JavaScript program to create a new string from a given string with the first character 
 * of the given string added at the front and back.
 */

function frontBack(str){
    first = str.substring(0, 1);
    return first + str + first;
}

console.log(frontBack('a'));
console.log(frontBack('ab'));
console.log(frontBack('abc'));
console.log(frontBack('mary'));

