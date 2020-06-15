/**
 * Write a JavaScript program to remove duplicate items from an array (ignore 
 *  case sensitivity).
 */

removeDuplications = (number) => {
    let x, len = number.length, out = [], obj = {};

    for (x = 0; x < len; x++) {
        obj[number[x]] = 0;
    }

    for (x in obj) {
        out.push(x);
    }

    return out;
}

let myNumber = [1, 2, 2, 4, 5, 4, 7, 8, 7, 3, 6];
result = removeDuplications(myNumber);

console.log(myNumber);
console.log(result);