let yesterday = function(dateYesterday) {
    let date = new Date(dateYesterday);

    return new Date((date.setDate(date.getDate() - 1))).toString();
}

console.log(yesterday('May 15, 2020'));
console.log(yesterday('May 16, 2020'));
console.log(yesterday('May 17, 2020'));