/**
 * Write a JavaScript function to get a full textual representation of the day of the week 
 * (Sunday through Saturday).
 */

Date.shortDays = ['Sunday', 'Monday', 'Tueday', 'Wednesday', 'Thursday', 'Friday', 'Saturday'];

function showShortDays(date) {
    return Date.shortDays[date.getDay()];
}

date = new Date();
console.log(showShortDays(date));

date = new Date(2015, 10, 1);
console.log(showShortDays(date));