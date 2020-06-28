/**
 * Check whether a value is an integer or not.
 */

isInteger = (number) => {
    if (typeof number !== 'number') {
        return false;
    }

    return !isNaN(number) && parseInt(Number(number)) == number && !isNaN(parseInt(number, 10));
}

console.log(isInteger(23));
console.log(isInteger(4e2));
console.log(isInteger(NaN));
console.log(isInteger(23.75));
console.log(isInteger(-23));