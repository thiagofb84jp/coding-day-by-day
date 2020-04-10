/**
 * Exercise 9:
 * Write a JavaScript program to determine whether a given year is a leap year in the 
 * Gregorian calendar.
 */

function leapYear(year){
    return (year % 100 === 0) ? (year % 400 === 0) : (year % 4 === 0);
}

console.log(leapYear(2020)); //true
console.log(leapYear(2016)); //true
console.log(leapYear(2000)); //true
console.log(leapYear(1700)); //false
console.log(leapYear(1800)); //false
console.log(leapYear(100)); //false