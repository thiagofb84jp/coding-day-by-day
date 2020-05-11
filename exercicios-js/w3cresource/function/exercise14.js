/**
 * Exericise 14:
 * Write a JavaScript function which says whether a number is perfect.
 */

function isPerfect(number) {
    let temp = 0;

    for (let i = 1; i <= number / 2; i++) {
        if (number % i === 0) {
            temp += i;
        }
    }

    if (temp === number && temp != 0) {
        console.log("It is a perfect number.");
    } else {
        console.log("It is not is a perfect number.");
    }
}

isPerfect(28);