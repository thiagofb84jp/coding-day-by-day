/**
 * Write a JavaScript function to get a full textual representation of a month, such as January 
 * or June.
 */

Date.longMonths = ['January', 'February', 'March', 'April', 'May', 'June', 'July', 'August',
    'September', 'October', 'November', 'December'
];

fullMonth = (date) => {
    return Date.longMonths[date.getMonth()];
}

date = new Date();
console.log(fullMonth(date));

date = new Date(2015, 10, 1);
console.log(fullMonth(date));