/**
 * Exercise 4:
 * Write a JavaScript program where the program takes a random integer between 1 to 10, 
 *      the user is then prompted to input a guess number. If the user input matches with
 *           guess number, the program will display a message "Good Work" otherwise display 
 *              a message "Not matched".
 */

const num = Math.ceil(Math.random() * 10);
console.log(num);

const gNum = prompt("Guess the number between 1 and 10 inclusive");
if (gNum === num) {
    console.log("Matched!");
} else {
    console.log("Not matched. The number was " + gNum);
}

/*
var readline = require('readline');

let rl = readline.createInterface({
    input : process.stdin,
    output : process.stdout
});

rl.question("What do you think of Node.JS?", function(answer){
    var resp = answer;
    console.log("Your answer: " + resp + " Thank you for your valuable feedback: ", answer);
    rl.close();
});
*/