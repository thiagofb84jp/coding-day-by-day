/**
 * Write a JavaScript function to get the minimum date from an array of dates.
 */

minimalDate = (allDates) => {
    let minDate = allDates[0],
        minimalDateObject = new Date(allDates[0]);

    allDates.forEach(function(date, index) {
        if (new Date(date) < minimalDateObject) {
            minDate = date;
            minimalDateObject = new Date(date);
        }
    });

    return minDate;
}

console.log(minimalDate(['2015/02/01', '2015/02/02', '2015/01/03']));