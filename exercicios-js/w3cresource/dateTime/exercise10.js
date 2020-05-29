function maxDate(allDates) {
    let maxDate = allDates[0],
        maxDateObject = new Date(allDates[0]);

    allDates.forEach(function(date, index) {
        if (new Date(date) > maxDateObject) {
            maxDate = date;
            maxDateObject = new Date(date);
        }
    });

    return maxDate;
}

console.log(maxDate(['2015/02/01', '2015/02/02', '2015/01/03']));