/**
 * Write a JavaScript function to count the number of vowels in a given string.
 */

vowelCount = (str) => {
    return str.match(/[aeiou]/gi).length;
}

console.log(vowelCount('The quick brown fox jumps over the lazy dog'));
console.log(vowelCount('God only knows that I am feel without you'));