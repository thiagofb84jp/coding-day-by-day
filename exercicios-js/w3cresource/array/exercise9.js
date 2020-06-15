/**
 * Write a JavaScript program which accept a number as input and insert dashes (-) between each two even numbers. For example if you accept 025468 the 
 *      output should be 0-254-6-8.
 */

const num = 12345;
const str = num.toString();
const result = [str[0]];

for (let x = 1; x < str.length; x++) {
    ((str[x - 1] % 2 === 0) && (str[x] % 2 === 0)) ? result.push('-', str[x]) : result.push(str[x]);
}

console.log(result.join(''));