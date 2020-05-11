/**
 * Exercise 12:
 * Write a JavaScript function that returns array elements larger than a number.
 */

const biggerElements = (value) => {
    return function (evalue, index, array) {
        return (evalue >= value);
    };
}

let result = [11, 45, 4, 31, 64, 10].filter(biggerElements(10));

console.log(result);