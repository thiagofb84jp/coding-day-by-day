/**
 * Write a JavaScript function to round a number to a given decimal places.
 */

function preciseRound(number, decimal) {
    if ((typeof number !== 'number') || (typeof decimal !== 'number')) {
        return false;
    }

    let numberSign = number >= 0 ? 1 : -1;

    return (Math.round((number * Math.pow(10, decimal)) + (numberSign * 0.0001)) / Math.pow(10, decimal)).toFixed(decimal);
}

console.log(preciseRound(12.375,2));
console.log(preciseRound(12.37499,2));
console.log(preciseRound(-10.3079499, 3));