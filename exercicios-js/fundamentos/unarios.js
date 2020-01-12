/**
 * Pontos importantes:
 * 1. Deixe o seu código o mais legível possível.
 * Evite realizar incrementos dentro de comparações.
 */

let num1 = 1;
let num2 = 2;

num1++; //num1 = num1 + 1;
console.log(num1);
--num1 //num1 = num1 - 1;
console.log(num1);

//Evite realizar esse tipo de prática!
console.log(++num1 === num2--); //true
console.log(num1 === num2);