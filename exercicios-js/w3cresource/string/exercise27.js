/**
 * Write a JavaScript function to convert ASCII to Hexadecimal format.
 */

asciiToHexa = (str) => {
    let arr1 = [];

    for (let n = 0, l = str.length; n < l; n++) {
        let hex = Number(str.charCodeAt(n)).toString(16);
        arr1.push(hex);
    }

    return arr1.join('');
}

console.log(asciiToHexa('12'));
console.log(asciiToHexa('100'));
console.log(asciiToHexa('8000'));