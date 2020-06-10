/**
 * Write a JavaScript function to get ISO-8601 week number of year, weeks starting on Monday.
 */

ISO8601WeekNumberOfYear = (date) => {
    let tdt = new Date(date.valueOf());
    let dayNumber = (date.getDay() + 6) % 7;

    tdt.setDate(tdt.getDate() - dayNumber + 3);

    let firstThursday = tdt.valueOf();
    tdt.setMonth(0, 1);

    if (tdt.getDay() !== 4) {
        tdt.setMonth(0, 1 + ((4 - tdt.getDay()) + 7) % 7);
    }

    return 1 + Math.ceil((firstThursday - tdt) / 604800000);
}

date = new Date();
console.log(ISO8601WeekNumberOfYear(date));

date = new Date(2015, 10, 1);
console.log(ISO8601WeekNumberOfYear(date));