/**
 * Exercise 28:
 * Write a JavaScript program to create a new string from a given string taking the last 3 characters and added at both the 
 * front and back. The string length must be 3 or more.
 */

function frontBack(str) {
    if (str.length >= 3) {
        strLength = 3;
        back = str.substring(str.length - 3);
        return back + str + back;
    } else {
        return false;
    }
}

console.log(frontBack("abc"));
console.log(frontBack("ab"));
console.log(frontBack("abcd"));