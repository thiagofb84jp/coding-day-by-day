/**
 * Write a JavaScript program to find the most frequent item of an array.
 */

let array1 = [3, 'a', 'a', 'a', 2, 3, 'a', 3, 'a', 2, 4, 9, 3];
let mf = 1;
let m = 0;
let item;

for (let i = 0; i < array1.length; i++) {
    for (let j = i; j < array1.length; j++) {
        if (array1[i] == array1[j]) {
            m++;
        }
        if (mf < m) {
            mf = m;
            item = array1[i];
        }
    }
    m = 0;
}

console.log(item + " (" + mf + " times )");