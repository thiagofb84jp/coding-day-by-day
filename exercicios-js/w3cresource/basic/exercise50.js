/**
 * Write a JavaScript program to capitalize the first letter of each word of 
 *      a given string.
 */

function capitalLetter(str) {
    str = str.split(" ");

    for (let i = 0, x = str.length; i < x; i++) {
        str[i] = str[i][0].toUpperCase() + str[i].substr(1);
    }

    return str.join(" ");
}

console.log(capitalLetter("Write a JavaScript program to capitalize the first letter of each word of a given string."));