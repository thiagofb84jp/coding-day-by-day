/**
 * Write a JavaScript function to get the quarter (1 to 4) of the year.
 */

function quarterOfTheYear(date) {
    let month = date.getMonth() + 1;

    return (Math.ceil(month / 3));
}

console.log(quarterOfTheYear(new Date()));
console.log(quarterOfTheYear(new Date(2015, 1, 21)));
console.log(quarterOfTheYear(new Date(2015, 10, 18)));