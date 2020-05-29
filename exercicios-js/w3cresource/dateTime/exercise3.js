let addMinutes = function(date, minutes) {
    return new Date(date.getTime() + minutes * 60000);
}

console.log(addMinutes(new Date(2020, 10, 2), 30).toString());