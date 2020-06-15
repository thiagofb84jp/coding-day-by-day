/**
 * Write a JavaScript program to compute the sum of the two given integers, If the sum is in the range 50..80 return 65 
 *      other wise return 80.
 */

sortaSum = (x, y) => {
    let value;
    const sumNumbers = x + y;

    (sumNumbers >= 50 && sumNumbers <= 80) ? value = 65 : value = 80;

    return value;
}

console.log(sortaSum(30, 20));
console.log(sortaSum(90, 80));