/**
 * Write a JavaScript program to evaluate binomial coefficients.
 */

binomial = (n, k) => {
    if ((typeof n !== 'number') || (typeof k !== 'number')) {
        return false;
    }

    let coeff = 1;

    for (let x = n - k + 1; x <= n; x++) {
        coeff *= x;
    }

    for (x = 1; x <= k; x++) {
        coeff /= x;
    }

    return coeff;
}

console.log(binomial(8, 3));
console.log(binomial(10, 2));