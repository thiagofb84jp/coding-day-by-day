/**
 * JavaScript function to check whether a given value is date string or not.
 */

const { isDate } = require("lodash");

isDateString = (str) => {
    regexExp = /^(1[0-2]|0?[1-9])\/(3[01]|[12][0-9]|0?[1-9])\/(?:[0-9]{2})?[0-9]{2}$/;

    let isValidRegexExp;

    (regexExp.test(str)) ? isValidRegexExp = true : isValidRegexExp = false;

    return isValidRegexExp;
}

console.log(isDateString("01/01/2015"));
console.log(isDateString("01/22/2015"));
console.log(isDateString("32/01/2015"));