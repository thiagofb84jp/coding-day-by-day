/**
 * Exercise 14:
 * Write a JavaScript function to count the occurrence of a substring in a string.
 */

function count(mainString, subStr) {
    mainString += '';
    subStr += '';

    if (subStr.length <= 0) {
        return mainString.length + 1;
    }

    subStr = subStr.replace(/[.*+?^${}()|[\]\\]/g, '\\$&');

    return (mainString.match(new RegExp(subStr, 'gi')) || []).length;
}

console.log(count("The quick brown fox jumps over the lazy dog", "the"));
console.log(count("The quick brown fox jumps over the lazy dog", "fox", false));