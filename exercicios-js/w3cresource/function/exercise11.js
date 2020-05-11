/**
 * Exercise 11:
 * Write a JavaScript function to compute the value of bn where n is the exponent and b is the bases. Accept b and n from the 
 *      user and display the result.
 */

const expoent = (b, n) => {
    let ans = 1;

    for (let i = 1; i <= n; i++) {
        ans = b * ans;
    }

    return ans;
}

console.log(expoent(2, 3));
console.log(expoent(2, 8));