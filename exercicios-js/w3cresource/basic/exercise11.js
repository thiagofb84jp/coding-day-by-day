/**
 * Exercise 11:
 * Write a JavaScript program to calculate number of days left until next Christmas.
 */

today = new Date();

let christmas = new Date(today.getFullYear(), 11, 25);

if (today.getMonth() == 11 && today.getDate() > 25) {
    christmas.setUTCFullYear(christmas.getFullYear() + 1);
}

let oneDay = 1000 * 60 * 60 * 24;
console.log(Math.ceil((christmas.getTime() - today.getTime()) / (oneDay)) 
            + " days left until christmas!");