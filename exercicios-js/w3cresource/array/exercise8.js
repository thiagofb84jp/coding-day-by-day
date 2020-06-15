/**
 * Write a JavaScript program to compute the sum and product of an array of integers.
 */

let array = [1, 2, 3, 4, 5, 6];

s = 0, p = 1;

for (let i = 0; i < array.length; i += 1) {
    s += array[i];
    p *= array[i];
}

console.log('Sum : ' + s + ' Product : ' + p);