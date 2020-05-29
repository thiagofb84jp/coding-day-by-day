let dateDifferentInDays = function(date1, date2) {
    date1 = new Date(date1);
    date2 = new Date(date2);

    return Math.floor((Date.UTC(date2.getFullYear(), date2.getMonth(), date2.getDate()) - Date.UTC(date1.getFullYear(), date1.getMonth(), date1.getDate())) / (1000 * 60 * 60 * 24));
}

console.log(dateDifferentInDays('04/02/2014', '11/04/2014'));
console.log(dateDifferentInDays('12/02/2014', '11/04/2014'));