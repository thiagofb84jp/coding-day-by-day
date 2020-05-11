/**
 * Exercise 18:
 * Write a JavaScript function to compute the factors of a positive integer.
 */

function factors(n) {
    let numberFactors = [], i;

    for (i = 0; i <= Math.floor(Math.sqrt(n)); i += 1) {
        if (n % i === 0) {
            numberFactors.push(i);

            if (n / i !== i) {
                numberFactors.push(n / i);
            }
        }

        numberFactors.sort(function (x, y) {
            return x - y;
        });
    }

    return numberFactors;
}

console.log(factors(15));
console.log(factors(16));
console.log(factors(17));