/**
 * Write a JavaScript function to get the day of the month, 2 digits with leading zeros.
 */

dayOfMonth = (date) => {
    return (date.getDate() < 10 ? '0' : '') + date.getDate();
}

date = new Date();
console.log(dayOfMonth(date));

date = new Date(2015, 10, 1);
console.log(dayOfMonth(date));