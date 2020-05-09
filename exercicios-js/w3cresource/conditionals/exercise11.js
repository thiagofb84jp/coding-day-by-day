/**
 * Exercise 11:
 * According to Wikipedia a happy number is defined by the following process : "Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers, while those that do not end in 1 are unhappy numbers (or sad numbers)". 
 * Write a JavaScript program to find and print the first 5 happy numbers.
 */

function happyNumbers(number) {
    let m, n;
    let c = [];

    while (number != 1 && c[number] != true) {
        c[number] = true;
        m = 0;

        while (number > 0) {
            n = number % 10;
            m += n * n;
            number = (number - n) / 10;
        }

        number = m;
    }

    return (number == 1);
}

let count = 5;
let number = 1;
let f5 = '';

while (count-- > 0) {
    while (!happyNumbers(number)) {
        number++;
    }

    f5 = f5 + (number + ",");
    number++;
}

console.log("First 5 happy numbers are : " + f5);