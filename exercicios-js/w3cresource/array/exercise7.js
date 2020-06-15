/**
 * Write a JavaScript program to find the sum of squares of a numeric vector.
 */

sumSquare = (array) => {
    let sum = 0;
    i = array.length;

    while (i--) {
        sum += Math.pow(array[i], 2);
    }
    return sum;
}

console.log(sumSquare([0, 1, 2, 3, 4]));