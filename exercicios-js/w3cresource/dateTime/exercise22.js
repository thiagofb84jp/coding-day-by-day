/**
 * Write a JavaScript function to get ISO-8601 numeric representation of the day of the 
 *      week (1 (for Monday) to 7 (for Sunday)).
 */

function isoNumericDate(date) {
    return (date.getDay() === 0 ? 7 : date.getDay());
}

date = new Date();
console.log(isoNumericDate(date));

date = new Date(2015, 10, 1);
console.log(isoNumericDate(date));