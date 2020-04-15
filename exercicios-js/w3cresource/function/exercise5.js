/**
 * Exercise 5:
 * Write a JavaScript function that accepts a string as a parameter and counts the number of 
 * vowels within the string.
 */

function vowelCount(str1){
    let vowelList = 'aeiouAEIOU';
    let vCount = 0;

    for (let x = 0; x < str1.length; x++) {
        if (vowelList.indexOf(str1[x] !== -1)) {
            vCount += 1;
        }
    }
    return vCount;
}

console.log(vowelCount("The quick brown fox")); //19
console.log(vowelCount("Jesus"));//5
console.log(vowelCount("Jesus and Mary Chain"));//20