/**
 * Write a JavaScript function that will return the number of minutes in hours and minutes.
 */

function timeConvert(number) {
    let num = number;
    let hours = (num / 60);
    let rHours = Math.floor(hours);
    let minutes = (hours - rHours) * 60;
    let rMinutes = Math.round(minutes);

    return num + " minutes = " + rHours + " hour(s) and " + rMinutes + " minute(s).";
}

console.log(timeConvert(90));