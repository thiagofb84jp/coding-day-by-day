/**
 * Exercise 13:
 * Write a JavaScript function to get the number of occurrences of each letter in specified string.
 */

function charCounts(string) {
    let uChars = {};

    string.replace(/\S/g, function(l){uChars[l] = (isNaN(uChars[l]) ? 1 : uChars[l] + 1)});

    return uChars;
}

console.log(charCounts("The quick brown fox jumps over the lazy dog"));