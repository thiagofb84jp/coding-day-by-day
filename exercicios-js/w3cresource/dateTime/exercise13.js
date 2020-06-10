/**
 * Write a JavaScript function to get the amount of days of a year.
 */

function daysOfAYear(year) {
    return isLeapYear(year) ? 366 : 365;
}

function isLeapYear(year) {
    return year % 400 === 0 || (year % 100 !== 0 && year % 4 === 0);
}

console.log(daysOfAYear(2020));
console.log(daysOfAYear(2015));