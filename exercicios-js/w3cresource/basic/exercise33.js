/**
 * Write a JavaScript program to check from two given integers whether one of them is 8 or their 
 *      sum or difference is 8.
 */

check8 = (x, y) => {
    let isDifferent;

    if (x == 8 || y == 8) {
        return true;
    }

    (x + y == 8 || Math.abs(x - y) == 8) ? isDifferent = true : isDifferent = false;

    return isDifferent;
}

console.log(check8(7, 8));
console.log(check8(16, 8));
console.log(check8(24, 32));
console.log(check8(17, 18));