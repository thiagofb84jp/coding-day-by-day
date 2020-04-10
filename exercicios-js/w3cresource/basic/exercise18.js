/**
 * Exercise 18:
 * Write a JavaScript program to compute the sum of the two given integers. If the two values are same, 
 * then returns triple their sum.
 */

function sumTriple(x, y){
    if (x == y) {
        return 3 * (x + y);
    } else {
        return (x + y);
    }
}

console.log(sumTriple(10, 20));
console.log(sumTriple(10, 10));