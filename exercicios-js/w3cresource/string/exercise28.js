/**
 * Write a JavaScript function to convert Hexadecimal to ASCII format.
 */

hexToAscii = (str) => {

    let hex = str1.toString();
    let str = '';

    for (let n = 0; n < hex.length; n += 2) {
        str += String.fromCharCode(parseInt(hex.substr(n, 2), 16));
    }

    return str;
}

console.log(hexToAscii('3132'));
console.log(hexToAscii('313030'));
console.log(hexToAscii('38303030'));