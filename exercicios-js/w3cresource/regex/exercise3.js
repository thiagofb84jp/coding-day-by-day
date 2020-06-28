/**
 * Write a JavaScript program that works as a trim function (string) using 
 *      regular expression.
 */

trim = (str) => {
    let result;

    if (typeof str === 'string') {
        result = str.replace(/^\s+|\s+$/g, '');
        return result;
    } else {
        return false;
    }
}

console.log(trim(' w3resource '));
console.log(trim(' c h a r l e s '));