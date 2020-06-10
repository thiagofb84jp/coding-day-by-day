/**
 *Write a JavaScript function to get the first element of an array. Passing a parameter 'n' will return the first 'n' 
    elements of the array.
 */

let first = function(array, number) {
    if (array == null) {
        return void 0;
    }

    if (number == null) {
        return array[0];
    }

    if (number < 0) {
        return [];
    }

    return array.slice(0, number);
}

console.log(first([7, 9, 0, -2]));
console.log(first([], 3));
console.log(first([7, 9, 0, -2], 3));
console.log(first([7, 9, 0, -2], 6));
console.log(first([7, 9, 0, -2], -3));