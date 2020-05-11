/**
 * Exercise 11:
 * Write a JavaScript function to convert a string into camel case.
 */

camelize = function camelize(str) {
    return str.replace(/\W+(.)/g, function (match, chr) {
        return chr.toUpperCase();
    });
}

console.log(camelize("Javascript Exercises"));
console.log(camelize("Javascript exercises"));
console.log(camelize("javascriptexercises"));