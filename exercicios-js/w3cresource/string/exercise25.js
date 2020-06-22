/**
 * Write a JavaScript function to strip leading and trailing spaces from a string.
 */

strip = (str) => {
    return str.replace(/^\s+|\s+$/g, '');
}

console.log(strip('w3resource '));
console.log(strip(' w3resource '));
console.log(strip(' w3resource  '));