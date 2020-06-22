/**
 * Write a JavaScript function to remove the first occurrence of a given 'search string' 
 *      from a string.
 */

removeFirstOccurence = (str, searchStr) => {
    let index = str.indexOf(searchStr);

    if (index === -1) {
        return str;
    }

    return str.slice(0, index) + str.slice(index + searchStr.length);
}

console.log(removeFirstOccurence("The quick brown fox jumps over the lazy dog", "the lazy"));