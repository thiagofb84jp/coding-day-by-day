/**
 * Write a JavaScript function to get a textual representation of a day (three letters, 
 *          Mon through Sun).
 */

Date.shortDays = ['Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat'];

function showShortDays(date) {
    return Date.shortDays[date.getDay()];
}

date = new Date();
console.log(showShortDays(date));

date = new Date(2015, 10, 1);
console.log(showShortDays(date));