/**
 * Exercise 3:
 * Write a JavaScript program that accept two integers and display the larger.
 */

let num1, num2;

num1 = 5;
num2 = 5;

if (parseInt(num1, 10) > parseInt(num2, 10)) {
    console.log("The large of " + num1 + " and " + num2 + " is " + num1 + ".");
} else if (parseInt(num2, 10) > parseInt(num1, 10)) {
    console.log("The large of " + num1 + " and " + num2 + " is " + num2 + ".");
} else {
    console.log("The values " + num1 + " and " + num2 + " are equals.");
}