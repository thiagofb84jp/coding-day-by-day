let compareDates = function(date1, date2) {
    if (date1 > date2) {
        return (date1 + " is greather than " + date2);
    } else if (date1 < date2) {
        return (date1 + " is less than " + date2);
    } else {
        return (date1 + " and " + date2 + " have the same value (are equals).");
    }
}

console.log(compareDates(new Date('11/14/2013 00:00'), new Date('11/14/2013 00:00')));
console.log(compareDates(new Date('11/14/2013 00:01'), new Date('11/14/2013 00:00')));
console.log(compareDates(new Date('11/14/2013 00:00'), new Date('11/14/2013 00:01')));