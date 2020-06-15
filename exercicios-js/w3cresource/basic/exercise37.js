/**
 * Write a JavaScript program to check from three given integers that whether a number is greater than or equal to 20 and less 
 *      than one of the others.
 */

lessBy20Others = (x, y, z) => {
    return (x >= 20 && (x < y || x < z))
        || (y >= 20 && (y < x || y < z))
        || (z >= 20 && (z < y || z < x));
}

console.log(lessBy20Others(23, 45, 10));
console.log(lessBy20Others(23, 23, 10));
console.log(lessBy20Others(21, 66, 75));