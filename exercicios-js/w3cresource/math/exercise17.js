/**
 * Create a Pythagorean function in JavaScript.
 */

pythagorean = (x, y) => {
    if ((typeof x !== 'number') || (typeof y !== 'number')) {
        return false;
    }

    let result = Math.sqrt(x * x + y * y);
    return result.toFixed(2);
}

console.log(pythagorean(2, 4));
console.log(pythagorean(3, 4));