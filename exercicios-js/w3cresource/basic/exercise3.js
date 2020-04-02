/**
 * Exercise 3:
 * Write a JavaScript function to find the area of a triangle where lengths 
 *      of the three of its sides are 5, 6, 7.
 * Extract of: https://www.w3resource.com/javascript-exercises/javascript-basic-exercise-4.php
 */

let side1 = 5;
let side2 = 6;
let side3 = 7;

let s = (side1 + side2 + side3) / 2;
let area = Math.sqrt(s * ((s - side1) * (s - side2) * (s - side3)));
console.log(area);