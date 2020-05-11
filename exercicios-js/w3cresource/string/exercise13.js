/**
 * Exercise 13:
 * Write a JavaScript function to chop a string into chunks of a given length.
 */

stringChop = function (str, size) {
    if (str == null) {
        return [];
    }

    str = String(str);
    size = ~~size;

    return size > 0 ? str.match(new RegExp('.{1,' + size + '}', 'g')) : [str];
}

console.log(stringChop('w3resource'));
console.log(stringChop('w3resource', 1));
console.log(stringChop('w3resource', 2));
console.log(stringChop('w3resource', 3));
console.log(stringChop('w3resource', 4));