/**
 * Write a JavaScript function to truncate a string to a certain number of words.
 */

truncate = (str, noWords) => {
    return str.split(" ").splice(0, noWords).join(" ");
}

console.log(truncate("The quick brown fox jumps over the lazy dog", 4));