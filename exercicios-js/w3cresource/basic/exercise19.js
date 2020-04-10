/**
 * Exercise 19:
 * Write a JavaScript program to compute the absolute difference between a specified 
 * number and 19. Returns triple their absolute difference if the specified number is 
 * greater than 19.
 */

function differenceNumber(number){
    if (number <= 19) {
        return 19 - number;
    } else {
        return (number - 19) * 3;
    }
}

console.log(differenceNumber(12));
console.log(differenceNumber(19));
console.log(differenceNumber(22));