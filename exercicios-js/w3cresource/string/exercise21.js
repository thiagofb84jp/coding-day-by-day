/**
 * Exercise 21:
 * Write a JavaScript function to uncamelize a string.
 */

function uncamelize(string, separator) {
    if (typeof(separator) == "undefined") {
        separator = " ";
    }

    string = string.replace(/[A-Z]/g, function(letter){
        return separator + letter.toLowerCase();
    });

    return string.replace("/^" + separator + "/", '');
}

console.log(uncamelize('helloWorld'));
console.log(uncamelize('helloWorld', '-'));
console.log(uncamelize('helloWorld', '_'));