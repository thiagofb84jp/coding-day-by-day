let monthDate = function(date) {
    mList = ["January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"];

    return mList[date.getMonth()];
}

console.log(monthDate(new Date("05/11/2009")));
console.log(monthDate(new Date("06/13/2014")));