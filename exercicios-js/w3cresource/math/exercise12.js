/**
 * Write a JavaScript function to find out if a number is a natural number or not.
 */

isNatural = (number) => {
    if (typeof number !== 'number') {
        return "Not a number!";
    }

    return (number >= 0.0) && (Math.floor(number) === number) && number != Infinity;
}

console.log(isNatural(-15));
console.log(isNatural(1));
console.log(isNatural(10.22));
console.log(isNatural(10/0));