/**
 * Write a JavaScript function to clone an array.
 */

let arrayClone = function(array) {
    return array.slice(0);
};

console.log(arrayClone([1, 2, 4, 0]));
console.log(arrayClone([1, 2, [4, 0]]));