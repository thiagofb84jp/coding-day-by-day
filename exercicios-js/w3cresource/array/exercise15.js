/**
 * Write a JavaScript program to sort the items of an array.
 */

let array1 = [-3, 8, 7, 6, 5, -4, 3, 2, 1];
let array2 = [];
let min = array1[0];
let pos;
let max = array1[0];

for (i = 0; i < array1.length; i++) {
    if (max < array1[i]) {
        max = array1[i];
    }
}

for (let i = 0; i < array1.length; i++) {
    for (let j = 0; j < array1.length; j++) {
        if (array1[j] != "x") {
            if (min > array1[j]) {
                min = array1[j];
                pos = j;
            }
        }
    }
    array2[i] = min;
    array1[pos] = "x";
    min = max;
}

console.log(array2);