/**
 * Exercise 7:
 * Write a JavaScript function that accepts a string as a parameter and converts the first letter of each word of the string 
 * in upper case.
 */

function upperCase(str){
    let array1 = str.split(' ');
    let newArray1 = [];

    for(let x = 0; x < array1.length; x++){
        newArray1.push(array1[x].charAt(0).toUpperCase() + array1[x].slice(1));
    }

    return newArray1.join(' ');
}

console.log(upperCase("the quick brown fox"));
console.log(upperCase("jesus and mary chain"));
console.log(upperCase("alice in chains"));