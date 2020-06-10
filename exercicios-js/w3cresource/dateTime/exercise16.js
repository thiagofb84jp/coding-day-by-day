/**
 * Write a JavaScript function to convert a Unix timestamp to time.
 */

unixTimeStamp = (time) => {
    let date = new Date(time * 1000);
    let hour = date.getHours();
    let minutes = "0" + date.getMinutes();
    let seconds = "0" + date.getSeconds();
    return hour + ":" + minutes.substr(-2) + ":" + seconds.substr(-2);
}

console.log(unixTimeStamp(1412743274));