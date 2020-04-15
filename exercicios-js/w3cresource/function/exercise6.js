/**
 * Exercise 6:
 * Write a JavaScript function that accepts a string as a parameter and find the longest 
 * word within the string.
 */

function findLongestWord(str){
    let array1 = str.match(/\w[a-z]{0,}/gi);
    let result = array1[0];

    for (let x = 1; x < array1.length; x++) {
        if (result.length < array1[x].length) {
            result = array1[x];
        }
    }
    return result;
}

console.log(findLongestWord('Web Development Tutorial'));
console.log(findLongestWord('Jesus and Mary Chain'));