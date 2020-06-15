/**
 * Write a JavaScript program to check from three given numbers (non negative integers) that two or all of them have 
 *      the same rightmost digit.
 */

sameLastDigit = (p, q, r) => {
    return (p % 10 === q % 10) || (p % 10 === r % 10) || (q % 10 === r % 10);
}

console.log(sameLastDigit(22, 32, 42));
console.log(sameLastDigit(102, 302, 2));
console.log(sameLastDigit(20, 22, 45));