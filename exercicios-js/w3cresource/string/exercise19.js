/**
 * Exercise 19:
 * Write a JavaScript function to truncate a string if it is longer than the specified number of characters. Truncated strings will end with a translatable ellipsis sequence ("…") (by default) or specified characters.
 */

textTruncate = function (string, length, ending) {
    if (length == null) {
        length = 100;
    }

    if (ending == null) {
        ending = '...';
    }

    if (string.length > length) {
        return string.substring(0, length - ending.length) + ending;
    } else {
        return string;
    }
};

console.log(textTruncate('We are doing JS string exercises.'));
console.log(textTruncate('We are doing JS string exercises.', 19));
console.log(textTruncate('We are doing JS string exercises.', 15, '!!'));