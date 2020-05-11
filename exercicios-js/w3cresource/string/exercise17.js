/**
 * Exercise 17:
 * Write a JavaScript function that can pad (left, right) a string to get to a determined length.
 */

function formattedString(pad, userString, padPos) {
    if (typeof userString === 'undefined') {
        return pad;
    }

    if (padPos == 'l') {
        return (pad + userString).slice(-pad.length);
    } else {
        return (userString + pad).substring(0, pad.length);
    }
}

console.log(formattedString('0000', 123, 'l'));
console.log(formattedString('00000000', 123, ''));