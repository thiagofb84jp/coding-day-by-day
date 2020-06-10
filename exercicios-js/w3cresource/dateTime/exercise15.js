/**
 * Write a JavaScript function to count the number of days passed since beginning of the year.
 */

function daysPassed(date) {
    let current = new Date(date.getTime());
    let previous = new Date(date.getFullYear(), 0, 1);

    return Math.ceil((current - previous + 1) / 86400000);
}

console.log(daysPassed(new Date(2015, 0, 15)));
console.log(daysPassed(new Date(2015, 11, 14)));