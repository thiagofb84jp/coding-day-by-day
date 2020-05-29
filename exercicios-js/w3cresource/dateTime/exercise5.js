let lastDay = function(year, month) {
    return new Date(year, month + 1, 0).getDate();
}

console.log(lastDay(2014, 0));
console.log(lastDay(2014, 1));
console.log(lastDay(2014, 11));