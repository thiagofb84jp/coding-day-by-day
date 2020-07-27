/**
 * Write a JavaScript function to check whether an 'input' is an array or not.
 */

const PI_NUMBER = 3.1415;

var myName = "Jonathan Lima";

let isArray = (input) => {
    return toString.call(input) === "[object Array]" ? true : false;
};

console.log(isArray('w3resource'));
console.log(isArray([1, 2, 4, 0]));
console.log(isArray(['1', '2', '4', '0']));
console.log(isArray(882));