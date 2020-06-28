/**
 * Write a JavaScript function to check whether a variable is numeric or not.
 */

isNumeric = (number) => {
    return !isNaN(parseFloat(number)) && isFinite(number);
}

console.log(isNumeric(12));
console.log(isNumeric('abcd'));
console.log(isNumeric('12'));
console.log(isNumeric(' '));
console.log(isNumeric(1.20));
console.log(isNumeric(-200));