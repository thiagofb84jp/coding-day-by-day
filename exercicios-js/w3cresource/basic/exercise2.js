/**
 * Exercise 2:
 * Write a JavaScript program to get the current date.
 * Expected Output :
 * month-day-year, month/day/year or day-month-year, day/month/year
 */

let today = new Date();
let day = today.getDate();

let month =  today.getMonth() + 1;
let year = today.getFullYear();

if (day < 10) {
    day = '0' + day;
}

if (month < 10) {
    month = '0' + month;
}

today = month + ' - ' + day + ' - ' + year; 
console.log(today);
today = month + ' / ' + day + ' / ' + year; 
console.log(today);
today = day + ' - ' + month + ' - ' + year; 
console.log(today);
today = day + ' / ' + month + ' / ' + year; 
console.log(today);