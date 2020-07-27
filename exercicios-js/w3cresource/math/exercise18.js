/**
 * Write a JavaScript function to calculate the sum of values in an array.
 */

sum = (input) => {

    if (toString.call(input) !== "[object Array]") {
        return false;
    }

    let total = 0;
    for (let i = 0; i < input.length; i++) {
        if (isNaN(input[i])) {
            continue;
        }
        total += Number(input[i]);
    }
    return total;
}

console.log(sum([1, 2, 3]));
console.log(sum([100, -200, 3]));
console.log(sum([1, 2, 'a', 3]));