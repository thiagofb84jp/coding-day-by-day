let isWeekend = function(dateWeekend) {
    let date = new Date(dateWeekend);

    if (date.getDay() == 6 || date.getDay() == 0) {
        return "Weekend";
    } else {
        return "Is not Weekend";
    }
}

console.log(isWeekend('Nov 15, 2014'));
console.log(isWeekend('Nov 16, 2014'));
console.log(isWeekend('Nov 17, 2014'));