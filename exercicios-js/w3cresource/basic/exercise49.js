/**
 * Write a JavaScript program to convert a given number to hours and minutes.
 */

function timeConvert(number) {
    let hours = Math.floor(number / 60);
    let minutes = number % 60;
    
    return hours + ":" + minutes;
}

console.log(timeConvert(71));
console.log(timeConvert(450));
console.log(timeConvert(1441));