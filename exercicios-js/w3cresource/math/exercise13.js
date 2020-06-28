/**
 * Write a JavaScript function to test if a number is a power of 2.
 */

powerOf2 = (number) => {
    if (typeof number !== 'number') {
        return 'Not a number!';
    }

    return number && (number & (number - 1)) === 0;
}

console.log(powerOf2(16));
console.log(powerOf2(18));
console.log(powerOf2(256));