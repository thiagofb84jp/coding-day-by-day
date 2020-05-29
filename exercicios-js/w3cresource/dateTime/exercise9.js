let currentDay = function(sp) {
    today = new Date();

    let date = today.getDate();
    let month = today.getMonth();
    let year = today.getFullYear();

    if (date < 10) {
        date = '0' + date;
    }

    if (month < 10) {
        month = '0' + month;
    }

    return (month + sp + date + sp + year);
}

console.log(currentDay('/'));
console.log(currentDay('-'));