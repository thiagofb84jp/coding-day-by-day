/**
 * Write a JavaScript program to reverse a given string.
 */

function stringReverse(str) {
    return str.split("").reverse().join("");
}

console.log(stringReverse("w3resource"));
console.log(stringReverse("www"));
console.log(stringReverse("Javascript"));
console.log(stringReverse("ogaiht"));