/**
 * Write a JavaScript function to get English ordinal suffix for the day of the month, 
 *      2 characters (st, nd, rd or th.).
 */

englishOrdinalSuffix = (date) => {
    return date.getDate() + (date.getDate() % 10 == 1 && date.getDate() !== 11 ? 'st' :
        (date.getDate() % 10 == 2 && date.getDate() != 12 ? 'nd' :
            (date.getDate() % 10 == 3 && date.getDate() != 13 ? 'rd' : 'th')));
}

date = new Date();
console.log(englishOrdinalSuffix(date));

date = new Date(2015, 10, 2);
console.log(englishOrdinalSuffix(date));