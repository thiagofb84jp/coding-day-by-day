/**
 * Exercise 17:
 * Write a JavaScript function to repeat a string a specified times.
 */

function repeatString(string, count) {
    if ((string == null) || (count < 0) || (count === Infinity) || (count == null)) {
        return ('Error in string or count');
    }

    count = count | 0; //Floor count.

    return new Array(count + 1).join(string);
}

console.log(repeatString('a', 4));
console.log(repeatString('b', 10));
console.log(repeatString('a'));
console.log(repeatString('a', -2));
console.log(repeatString('a', Infinity));