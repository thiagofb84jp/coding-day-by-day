/**
 * Exercise 1:
 * Write a JavaScript for loop that will iterate from 0 to 15. For each iteration, it will check if the current number is odd or even, and display a message 
 *      to the screen.
 */

for(let x = 0; x <= 15; x++){
    if (x === 0) {
        console.log(x + " is even");
    } else if (x % 2 === 0) {
        console.log(x + " is even");
    } else {
        console.log(x + " is odd");
    }
}