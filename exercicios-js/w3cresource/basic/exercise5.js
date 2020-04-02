/**
 * Exercose 5:
 * Write a JavaScript program to find which 1st January is being a Sunday between 2014 and 2050.
 * Avaliable on: https://www.w3resource.com/javascript-exercises/javascript-basic-exercise-7.php
 */

console.log("------------------");
for (let year = 2014; year <= 2050; year++) {
    let d = new Date(year, 0, 1);
    if (d.getDay() === 0) {
        console.log("1st January is being a Sunday " + year);
    }
    
}
console.log("------------------");