/**
 * Write a JavaScript function to alphabetize a given string.
 */

function alphabetizeString(str) {
    return str.split('').sort().join('').trim();
}

console.log(alphabetizeString('United States'));