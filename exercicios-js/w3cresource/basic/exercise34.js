/**
 * Write a JavaScript program to check three given numbers, if the three numbers are same return 30 otherwise return 20 and 
 *      if two numbers are same return 40.
 */

threeNumbers = (x, y, z) => {
    let number;

    if (x == y && y == z) {
        return 30;
    }

    (x == y || y == z || z == x) ? number = 40 : number = 20;

    return number;
}

console.log(threeNumbers(8, 8, 8));
console.log(threeNumbers(8, 8, 18));
console.log(threeNumbers(8, 7, 18));