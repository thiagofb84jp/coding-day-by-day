/**
 * Exercise 15
 * Write a JavaScript function to extract unique characters from a string.
 */

function uniqueChar(str1) {
    let str = str1;
    let unique = "";

    for (let x = 0; x < str.length; x++) {
        if (unique.indexOf(str.charAt(x)) == -1) {
            unique += str[x];
        }
    }

    return unique;
}

console.log(uniqueChar("thequickbrownfoxjumpsoverthelazydog"));