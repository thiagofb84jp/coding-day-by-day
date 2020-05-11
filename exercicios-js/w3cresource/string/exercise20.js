/**
 * Exercise 20:
 * Write a JavaScript function to humanized number (Formats a number to a human-readable string.) with the correct suffix such as 1st, 2nd, 3rd or 4th.
 */

humanizeFormat = function humanize(number) {
    if (typeof (number) == "undefined") {
        return;
    }

    if (number % 100 >= 11 && number % 100 <= 13) {
        return number + "th";
    }

    switch (number % 10) {
        case 1:
            return number + "st";
        case 2:
            return number + "nd";
        case 3:
            return number + "rd";
    }

    return number + "th";
}

console.log(humanizeFormat());
console.log(humanizeFormat(1));
console.log(humanizeFormat(8));
console.log(humanizeFormat(301));
console.log(humanizeFormat(402));