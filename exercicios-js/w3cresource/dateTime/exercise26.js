/**
 * Write a JavaScript function to get a numeric representation of a month, 
 *  with leading zeros (01 through 12).
 */

function numericMonth(date) {
    return (date.getMonth() < 9 ? '0' : '') + (date.getMonth() + 1);
}

date = new Date();
console.log(numericMonth(date));

date = new Date(2015, 10, 1);
console.log(numericMonth(date));